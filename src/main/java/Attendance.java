import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.ArrayList;

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
    }

}
