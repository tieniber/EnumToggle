// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies;

public class Employee
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject employeeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestSuite.Employee";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Level("Level"),
		Active("Active");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Employee(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestSuite.Employee"));
	}

	protected Employee(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject employeeMendixObject)
	{
		if (employeeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestSuite.Employee", employeeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestSuite.Employee");

		this.employeeMendixObject = employeeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Employee.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testsuite.proxies.Employee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testsuite.proxies.Employee.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static testsuite.proxies.Employee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testsuite.proxies.Employee(context, mendixObject);
	}

	public static testsuite.proxies.Employee load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testsuite.proxies.Employee.initialize(context, mendixObject);
	}

	public static java.util.List<testsuite.proxies.Employee> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testsuite.proxies.Employee> result = new java.util.ArrayList<testsuite.proxies.Employee>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestSuite.Employee" + xpathConstraint))
			result.add(testsuite.proxies.Employee.initialize(context, obj));
		return result;
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
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * Set value of Level
	 * @param level
	 */
	public final testsuite.proxies.Level getLevel()
	{
		return getLevel(getContext());
	}

	/**
	 * @param context
	 * @return value of Level
	 */
	public final testsuite.proxies.Level getLevel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Level.toString());
		if (obj == null)
			return null;

		return testsuite.proxies.Level.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Level
	 * @param level
	 */
	public final void setLevel(testsuite.proxies.Level level)
	{
		setLevel(getContext(), level);
	}

	/**
	 * Set value of Level
	 * @param context
	 * @param level
	 */
	public final void setLevel(com.mendix.systemwideinterfaces.core.IContext context, testsuite.proxies.Level level)
	{
		if (level != null)
			getMendixObject().setValue(context, MemberNames.Level.toString(), level.toString());
		else
			getMendixObject().setValue(context, MemberNames.Level.toString(), null);
	}

	/**
	 * @return value of Active
	 */
	public final Boolean getActive()
	{
		return getActive(getContext());
	}

	/**
	 * @param context
	 * @return value of Active
	 */
	public final Boolean getActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Active.toString());
	}

	/**
	 * Set value of Active
	 * @param active
	 */
	public final void setActive(Boolean active)
	{
		setActive(getContext(), active);
	}

	/**
	 * Set value of Active
	 * @param context
	 * @param active
	 */
	public final void setActive(com.mendix.systemwideinterfaces.core.IContext context, Boolean active)
	{
		getMendixObject().setValue(context, MemberNames.Active.toString(), active);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return employeeMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testsuite.proxies.Employee that = (testsuite.proxies.Employee) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "TestSuite.Employee";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}