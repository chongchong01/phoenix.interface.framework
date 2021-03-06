/**
 * http://surenpi.com
 */
package org.suren.autotest.interfaces.framework;

/**
 * @author suren
 * @date Aug 13, 2016 7:25:59 PM
 */
public class Param
{
	private String name;
	private String value;
	private String type;
	private String ref;
	private String position;
	private boolean required;
	/**
	 * @return the required
	 */
	public boolean isRequired()
	{
		return required;
	}
	/**
	 * @param required the required to set
	 */
	public void setRequired(boolean required)
	{
		this.required = required;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getValue()
	{
		return value;
	}
	public void setValue(String value)
	{
		this.value = value;
	}
	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	/**
	 * @return the position
	 */
	public String getPosition()
	{
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position)
	{
		this.position = position;
	}
	/**
	 * @return the ref
	 */
	public String getRef()
	{
		return ref;
	}
	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref)
	{
		this.ref = ref;
	}
}
