import java.util.HashMap;
import java.util.ArrayList;

public class Attendance {
    private HashMap<String, Boolean> databaseOfAttendance;
    Texts screenWriter;
    Keyboard commandKeyboard;

    public Attendance() {
        databaseOfAttendance = new HashMap<>();
        screenWriter = new Texts();
        commandKeyboard = new Keyboard();
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

    public void checkAttendance()
    {
        for (String key: databaseOfAttendance.keySet()) {
            System.out.println(key);
            System.out.println(databaseOfAttendance.get(key));
        }
    }

}
