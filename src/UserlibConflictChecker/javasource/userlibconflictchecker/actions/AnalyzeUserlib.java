// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package userlibconflictchecker.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import userlibconflictchecker.proxies.UserlibAnalyzeResult;

public class AnalyzeUserlib extends CustomJavaAction<java.util.List<IMendixObject>>
{
	public AnalyzeUserlib(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
        this.doAnalyze();

        java.util.List<IMendixObject> moResults = new ArrayList<IMendixObject>();
        for (String jarName : results.keySet()) {
        	UserlibAnalyzeResult moResult = new UserlibAnalyzeResult(getContext());
        	moResult.setJarName(jarName);
        	moResult.setSearchInMvnrepository("https://mvnrepository.com/search?q=" + jarName);
        	moResult.setClassCount(jarClasses.get(jarName).size());
        	moResults.add(moResult.getMendixObject());

        	Map<String, Set<String>> resultsOfJar = results.get(jarName);
        	StringBuilder sbSummary = new StringBuilder();
        	StringBuilder sbDetail = new StringBuilder();
        	for (String opponentJarName : resultsOfJar.keySet()) {
        		Set<String> resultsOfconflictedJar = resultsOfJar.get(opponentJarName);
        		sbSummary.append("<").append(opponentJarName).append(" - ").append(resultsOfconflictedJar.size()).append(" classes conflicted.>\r\n");
        		sbDetail.append("<").append(opponentJarName).append(" - ").append(resultsOfconflictedJar.size()).append(" classes conflicted.>\r\n");
        		for (String className : resultsOfconflictedJar) {
            		sbDetail.append("  ").append(className).append("\r\n");
        		}
        	}
        	moResult.setSummary(clipForExcel(sbSummary.toString()));
        	moResult.setDetail(clipForExcel(sbDetail.toString()));
        }
        //logger.info(results.toString());
        Core.commit(getContext(), moResults);
        return moResults;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "AnalyzeUserlib";
	}

	// BEGIN EXTRA CODE
	private final ILogNode logger = Core.getLogger(this.getClass().getName());
	private final Map<String, Set<String>>jarClasses = new LinkedHashMap<String, Set<String>>();
	private final Map<String, Set<String>>classJars = new LinkedHashMap<String, Set<String>>();
	private final Set<String> conflictedClasses = new TreeSet<String>();

	// jarNamr 1:N ConflictedJarName 1:N className
	private final Map<String, Map<String, Set<String>>>results = new LinkedHashMap<String, Map<String, Set<String>>>();

	private void doAnalyze() throws Exception {

        String userlibpath = Core.getConfiguration().getBasePath() + //
        		Core.getConfiguration().getFileSeparator() + //
        		"model" + //
        		Core.getConfiguration().getFileSeparator() + //
        		"lib" + //
        		Core.getConfiguration().getFileSeparator() + //
        		"userlib";
        File userlib = new File(userlibpath);
        File[] userliblist = userlib.listFiles();

        for (int i = 0; i < userliblist.length; i++) {
        	File file = userliblist[i];
            if (file.isDirectory() || !file.exists() || !file.getName().endsWith(".jar"))
                continue;
            String jarName = file.getName();

            Map<String, Set<String>> resultsOfJar = new LinkedHashMap<String, Set<String>>();
            results.put(jarName, resultsOfJar);

            Set<String> classesInJar = new TreeSet<String>();
            jarClasses.put(jarName, classesInJar);	// add jar to jarClasses

            JarFile jarFile = new JarFile(file);
            for (Enumeration<?> e = jarFile.entries(); e.hasMoreElements();) {
                JarEntry entry = (JarEntry) e.nextElement();
                if (entry.isDirectory() || entry.getName().indexOf(".class") < 0 || entry.getName().startsWith("META-INF") || entry.getName().equals("module-info.class"))
                    continue;
                String className = entry.getName();

                classesInJar.add(className);	// add claass to jarClasses
                Set<String> jarsHasClass = classJars.get(className);
                if (jarsHasClass == null) {
                	jarsHasClass = new TreeSet<String>();
                	classJars.put(className, jarsHasClass);
                } else {
              		conflictedClasses.add(className);
                }
                jarsHasClass.add(file.getName());
            }
            jarFile.close();
        }

        // conflictedClasses Loop
        for (String className : conflictedClasses) {
        	Set<String> jarsHasClass = classJars.get(className);
        	// evely conflictedClasses jarName Loop. Must be over two entries.
        	for (String jarName : jarsHasClass) {
        		Map<String, Set<String>> resultsOfJar = results.get(jarName);

        		for (String opponentJarName : jarsHasClass) {
            		if (jarName.equals(opponentJarName)) {
            			continue;	// don't record ageinst itself.
            		}

            		Set<String> resultsOfconflictedJar = resultsOfJar.get(opponentJarName);
            		if (resultsOfconflictedJar == null) {
            			resultsOfconflictedJar = new TreeSet<String>();
            			resultsOfJar.put(opponentJarName, resultsOfconflictedJar);
            		}
            		resultsOfconflictedJar.add(className);
            	}
        	}
        }
	}

	private static String clipForExcel(String s) {
		return s.substring(0, Math.min(s.length(), 32767));
	}



	// END EXTRA CODE
}
