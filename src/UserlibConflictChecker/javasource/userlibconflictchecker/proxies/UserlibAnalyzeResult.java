// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package userlibconflictchecker.proxies;

public class UserlibAnalyzeResult
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject userlibAnalyzeResultMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UserlibConflictChecker.UserlibAnalyzeResult";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		JarName("JarName"),
		SearchInMvnrepository("SearchInMvnrepository"),
		ClassCount("ClassCount"),
		Summary("Summary"),
		Detail("Detail");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public UserlibAnalyzeResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UserlibConflictChecker.UserlibAnalyzeResult"));
	}

	protected UserlibAnalyzeResult(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject userlibAnalyzeResultMendixObject)
	{
		if (userlibAnalyzeResultMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UserlibConflictChecker.UserlibAnalyzeResult", userlibAnalyzeResultMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UserlibConflictChecker.UserlibAnalyzeResult");

		this.userlibAnalyzeResultMendixObject = userlibAnalyzeResultMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UserlibAnalyzeResult.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static userlibconflictchecker.proxies.UserlibAnalyzeResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return userlibconflictchecker.proxies.UserlibAnalyzeResult.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static userlibconflictchecker.proxies.UserlibAnalyzeResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new userlibconflictchecker.proxies.UserlibAnalyzeResult(context, mendixObject);
	}

	public static userlibconflictchecker.proxies.UserlibAnalyzeResult load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return userlibconflictchecker.proxies.UserlibAnalyzeResult.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of JarName
	 */
	public final java.lang.String getJarName()
	{
		return getJarName(getContext());
	}

	/**
	 * @param context
	 * @return value of JarName
	 */
	public final java.lang.String getJarName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JarName.toString());
	}

	/**
	 * Set value of JarName
	 * @param jarname
	 */
	public final void setJarName(java.lang.String jarname)
	{
		setJarName(getContext(), jarname);
	}

	/**
	 * Set value of JarName
	 * @param context
	 * @param jarname
	 */
	public final void setJarName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String jarname)
	{
		getMendixObject().setValue(context, MemberNames.JarName.toString(), jarname);
	}

	/**
	 * @return value of SearchInMvnrepository
	 */
	public final java.lang.String getSearchInMvnrepository()
	{
		return getSearchInMvnrepository(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchInMvnrepository
	 */
	public final java.lang.String getSearchInMvnrepository(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SearchInMvnrepository.toString());
	}

	/**
	 * Set value of SearchInMvnrepository
	 * @param searchinmvnrepository
	 */
	public final void setSearchInMvnrepository(java.lang.String searchinmvnrepository)
	{
		setSearchInMvnrepository(getContext(), searchinmvnrepository);
	}

	/**
	 * Set value of SearchInMvnrepository
	 * @param context
	 * @param searchinmvnrepository
	 */
	public final void setSearchInMvnrepository(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String searchinmvnrepository)
	{
		getMendixObject().setValue(context, MemberNames.SearchInMvnrepository.toString(), searchinmvnrepository);
	}

	/**
	 * @return value of ClassCount
	 */
	public final java.lang.Integer getClassCount()
	{
		return getClassCount(getContext());
	}

	/**
	 * @param context
	 * @return value of ClassCount
	 */
	public final java.lang.Integer getClassCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ClassCount.toString());
	}

	/**
	 * Set value of ClassCount
	 * @param classcount
	 */
	public final void setClassCount(java.lang.Integer classcount)
	{
		setClassCount(getContext(), classcount);
	}

	/**
	 * Set value of ClassCount
	 * @param context
	 * @param classcount
	 */
	public final void setClassCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer classcount)
	{
		getMendixObject().setValue(context, MemberNames.ClassCount.toString(), classcount);
	}

	/**
	 * @return value of Summary
	 */
	public final java.lang.String getSummary()
	{
		return getSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of Summary
	 */
	public final java.lang.String getSummary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Summary.toString());
	}

	/**
	 * Set value of Summary
	 * @param summary
	 */
	public final void setSummary(java.lang.String summary)
	{
		setSummary(getContext(), summary);
	}

	/**
	 * Set value of Summary
	 * @param context
	 * @param summary
	 */
	public final void setSummary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String summary)
	{
		getMendixObject().setValue(context, MemberNames.Summary.toString(), summary);
	}

	/**
	 * @return value of Detail
	 */
	public final java.lang.String getDetail()
	{
		return getDetail(getContext());
	}

	/**
	 * @param context
	 * @return value of Detail
	 */
	public final java.lang.String getDetail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Detail.toString());
	}

	/**
	 * Set value of Detail
	 * @param detail
	 */
	public final void setDetail(java.lang.String detail)
	{
		setDetail(getContext(), detail);
	}

	/**
	 * Set value of Detail
	 * @param context
	 * @param detail
	 */
	public final void setDetail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String detail)
	{
		getMendixObject().setValue(context, MemberNames.Detail.toString(), detail);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return userlibAnalyzeResultMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final userlibconflictchecker.proxies.UserlibAnalyzeResult that = (userlibconflictchecker.proxies.UserlibAnalyzeResult) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "UserlibConflictChecker.UserlibAnalyzeResult";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
