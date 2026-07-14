# Description
This module offers you the function to detect conflicts between jar files under the Userlib directory, helping you maintain consistency between your App's jar files.
Under your app's Userlib directory, you'll find bundled jar files for each component you download from the Market Place. They are required for the individual Market Place components to work, but they are often bundled with different versions of the same jar file for each component, or the same jar file with different filenames. In addition, different versions of the same jar file may be added when the Market Place component is upgraded. This is because old jar files are not automatically deleted by the Mendix modeler. However, in terms of the Java runtime environment, it's not a good situation to have different versions of the same jar file in the classpath. It sometimes creates invalid references and breaks dependencies that components expect. Also, older versions of jar files often contain vulnerabilities.
Try cleaning up your app's conflicting jars with this module. It may solve some unexplained problems.
 
# Typical usage scenario
Check for conflicts in jar files under the Userlib directory when adding and updating marketplace components.
Vulnerability check of jar files under Userlib directory on mvnrepository.com
Features and limitations
Lists class conflicts with other jar files for each jar file under the Userlib directory.
Show link for searching individual jar files on mvnrepository.com.
# Dependencies
There is no dependencies on other modules and oss jars.
# Configuration
Add the UserlibConflictCheckerPage to the navigation so that it can be used with administrator privileges.
#Restrictions
This module does not automatically remove unnecessary jar files.
