import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Purpose of this class is to store the information about attendance and provide methods to read, modify, import and export.
 */

public class Attendance {
    private HashMap<String, Boolean> databaseOfAttendance;
    Texts screenWriter;
    Keyboard commandKeyboard;
    IOoperations ioManager;

    public Attendance() {
        databaseOfAttendance = new HashMap<>();
        screenWriter = new Texts();
        commandKeyboard = new Keyboard();
        ioManager = new IOoperations();
    }

    public void takeAttendance(ArrayList<String> allMemberNames)
    {
        for (String name: allMemberNames) {
            boolean attended = false;
            screenWriter.doesMemberAttended(name);
            String userInput = commandKeyboard.getInput();
            if (userInput.equals("1")){
                attended = true;
            }
            databaseOfAttendance.put(name, attended);
        }
        screenWriter.attendanceRecorded();
    }

    public void displayAttendance()
    {
        screenWriter.attendanceHeader();
        for (String key: databaseOfAttendance.keySet()) {
            if(databaseOfAttendance.get(key)) {
                screenWriter.attendedMember(key);
            } else {
                screenWriter.notAttendedMember(key);
            }
        }
    }

    public void attendanceExport()
    {
        ioManager.saveAttendance(databaseOfAttendance);
    }

    public void attendanceImport()
    {
        databaseOfAttendance = ioManager.loadAttendance();
        displayAttendance();
    }

    public int attendanceDatabaseSize()
    {
        return databaseOfAttendance.size();
    }

}
