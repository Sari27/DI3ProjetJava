package controller.emulator;

import java.time.LocalDateTime;

public class CheckInOut 
{
	/* ================================================================= */
	/************************* CLASS ATTRIBUTS ***************************/
	/*********************************************************************/

	private String departmentName;
	private int employeeID;
	private LocalDateTime checkTime;
	private boolean status;

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/*************************** CONSTRUCTORS ****************************/
	/*********************************************************************/

	/**
	 * @brief Default Constructor
	 */
	public CheckInOut() 
	{
		departmentName = new String();
		setEmployeeID(employeeID);
		checkTime = LocalDateTime.now();
		status = true; // Default value
	}

	/**
	 * @brief Copy Constructor
	 * @param departmentName
	 * @param employeeID
	 * @param checkTime
	 * @param status
	 */
	public CheckInOut(String departmentName, int employeeID, LocalDateTime checkTime, boolean status) 
	{
		super();
		this.departmentName = departmentName;
		this.employeeID = employeeID;
		this.checkTime = checkTime;
		this.status = status;
	}

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/********************** GETTERS AND SETTERS **************************/
	/*********************************************************************/

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() 
	{
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) 
	{
		this.departmentName = departmentName;
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() 
	{
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) 
	{
		this.employeeID = employeeID;
	}

	/**
	 * @return the checkTime
	 */
	public LocalDateTime getCheckTime() 
	{
		return checkTime;
	}

	/**
	 * @param checkTime the checkTime to set
	 */
	public void setCheckTime(LocalDateTime checkTime) 
	{
		this.checkTime = checkTime;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() 
	{
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) 
	{
		this.status = status;
	}

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */
	
	/* ================================================================= */
	/***************************** METHODS *******************************/
	/*********************************************************************/

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */
}
