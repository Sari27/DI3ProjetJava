package view.emulator;

import controller.emulator.CheckInOut;

public class ConsultationHistory 
{
	/* ================================================================= */
	/************************* CLASS ATTRIBUTES **************************/
	/*********************************************************************/

	private CheckInOut[] checks;

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/*************************** CONSTRUCTORS ****************************/
	/*********************************************************************/
	public ConsultationHistory() 
	{
		setChecks(checks);
	}

	/**
	 * @param checks
	 */
	public ConsultationHistory(CheckInOut[] checks) 
	{
		super();
		this.checks = checks;
	}

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/********************** GETTERS AND SETTERS **************************/
	/*********************************************************************/
	
	/**
	 * @return the checks
	 */
	public CheckInOut[] getChecks() 
	{
		return checks;
	}

	/**
	 * @param checks the checks to set
	 */
	public void setChecks(CheckInOut[] checks) 
	{
		this.checks = checks;
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
