package controller.emulator;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import controller.shared.SerializationProcess;
import model.emulator.History;
import model.shared.EmployeeInfo;

/**
 * @brief EmulatorBackup class to save data entered into the emulator during a
 *        check in out, and to restore it when it is needed, the data is safe
 *        from being lost.
 *
 */
public class EmulatorBackup extends SerializationProcess {

	/**
	 * @brief Method to store data from the emulator using a file and data supposed
	 *        to be saved
	 * @param backupFileName
	 * @param dataToSave
	 * @throws IOException
	 */
	public void saveData(String backupFileName, Object dataToSave) throws IOException {
		initialize(new FileOutputStream(backupFileName));
		insert(dataToSave);
	}

	/**
	 * @brief Another method to store data from the emulator using a file, data and
	 *        a stream status
	 * @param backupFileName
	 * @param dataToSave
	 * @param streamStatus
	 * @throws IOException
	 */
	public void saveData(String backupFileName, Object dataToSave, int streamStatus) throws IOException {
		if (streamStatus > 0)
			initialize(new FileOutputStream(backupFileName));
		else
			initialize(getsOut());
		insert(dataToSave, streamStatus);
	}

	/**
	 * @brief Method to restore data from history
	 * @param backupFileName
	 * @return backup
	 * @throws ClassNotFoundException
	 * @throws EOFException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public Object restoreData(String backupFileName)
			throws ClassNotFoundException, EOFException, IOException, FileNotFoundException {
		initialize(new FileInputStream(backupFileName));
		Object backup = (Object) extract();
		int i = 0;

		if (backup instanceof History) {

			// get keys() from HashTable and iterate
			Enumeration<EmployeeInfo> enumeration = History.getChecksPerEmployee().keys();
			// iterate using enumeration object
			while (enumeration.hasMoreElements()) {
				EmployeeInfo key = enumeration.nextElement();
				History.addToHistory(History.getChecksPerEmployee().get(key).get(i), key);
				i += 1;
			}

		}
		return backup;
	}

	/**
	 * @brief Method to restore data from history
	 * @param backupFileName
	 * @param streamStatus
	 * @return backup
	 * @throws ClassNotFoundException
	 * @throws EOFException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public Object restoreData(String backupFileName, int streamStatus)
			throws ClassNotFoundException, EOFException, IOException, FileNotFoundException {
		if (streamStatus > 0)
			initialize(new FileInputStream(backupFileName));
		else
			initialize(getsIn());
		Object backup = (Object) extract(streamStatus);

		int i = 0;

		if (backup instanceof History) {

			// get keys() from HashTable and iterate
			Enumeration<EmployeeInfo> enumeration = History.getChecksPerEmployee().keys();
			// iterate using enumeration object
			while (enumeration.hasMoreElements()) {
				EmployeeInfo key = enumeration.nextElement();
				History.addToHistory(History.getChecksPerEmployee().get(key).get(i), key);
				i += 1;
			}

		}
		return backup;
	}
}