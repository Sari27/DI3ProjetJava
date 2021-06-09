package controller.emulator;

import java.time.LocalDate;
import model.emulator.History;
import model.emulator.History.EventDuringCheck;
import model.shared.CheckInOut;
import model.shared.EmployeeInfo;
import view.emulator.ViewEmulator;


/**
 * Class to collect data from emulator
 *
 */
public class Emulator extends EmulatorSettings {

	// Attribute to gather CheckInOuts from Emulator once an employee has entered
	// his ID
	private CheckInOut checksFromEmulator;
	private EventDuringCheck event;

	/**
	 * @param checksFromEmulator
	 * @param event
	 */
	public Emulator(CheckInOut checksFromEmulator, EventDuringCheck event) {
		super();
		this.checksFromEmulator = checksFromEmulator;
		this.event = event;
	}

	/***************** Setter/getter *****************/
	/**
	 * @return the event
	 */
	public EventDuringCheck getEvent() {
		return event;
	}

	/**
	 * @param event the event to set
	 */
	public void setEvent(EventDuringCheck event) {
		this.event = event;
	}

	/**
	 * @return the checksFromEmulator
	 */
	public CheckInOut getChecksFromEmulator() {
		return checksFromEmulator;
	}

	/**
	 * @param checksFromEmulator the checksFromEmulator to set
	 */
	public void setChecksFromEmulator(CheckInOut checksFromEmulator) {
		this.checksFromEmulator = checksFromEmulator;
	}

	/***************** Methods *****************/
	/**
	 * @throws Exception
	 * @brief Method to add Employee ID and time of CheckInOut
	 */
	public void addElmentToCheckInOut() throws Exception {

		EmployeeInfo info = new EmployeeInfo();
		LocalDate date = LocalDate.now();
		date = ViewEmulator.getDate();
		CheckInOut checks = new CheckInOut();
		checks = ViewEmulator.getChecks();
		info.setID(checks.getEmployeeID());

		// Creating a check in out
		checksFromEmulator.setEmployeeID(checks.getEmployeeID());
		checksFromEmulator.setCheckTime(checks.getCheckTime());
		checksFromEmulator.setEvent(checks.getEvent());

		// Adding checks to history database
		History.addToHistory(checksFromEmulator, info, date);

	}

	/**
	 * @brief Method to remove a check in out
	 */
	public void removeCheckInOut() {
		this.checksFromEmulator = new CheckInOut();
		this.event = null;
	}
}
