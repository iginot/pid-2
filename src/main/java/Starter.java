/**
 * Purpose of this class is to start application and to keep it opened until the database is not loaded (so far)
 */

public class Starter {

    DatabaseOfMembers databaseOfMembers;
    Keyboard commandKeyboard;
    Texts screenWriter;
    Attendance attendanceManager;

    public Starter()
    {
        databaseOfMembers = new DatabaseOfMembers();
        commandKeyboard = new Keyboard();
        screenWriter = new Texts();
        attendanceManager = new Attendance();
    }

    private void runtime() {

        boolean runtimeActive = true;
        screenWriter.welcomeText();

        while (runtimeActive) {
            String userInput = commandKeyboard.getInput();
            runtimeActive = processCommand(userInput);
            if(runtimeActive) {
                screenWriter.questionAfterCommand();
                screenWriter.menuScreen();
            } else {
                screenWriter.exitScreen();
            }
        }
    }

    private boolean processCommand(String inputFromUser) {
        switch (inputFromUser) {
            case "1":
                databaseOfMembers.addNewMembers();
                return true;
            case "2":
                attendanceManager.takeAttendance(databaseOfMembers.getNames());
                return true;
            case "3":
                attendanceManager.checkAttendance();
                return true;
            case "4":
                attendanceManager.attendanceExport();
                return true;
            case "0":
                return false;
            default:
                screenWriter.wrongMenuInput();
                return true;
        }
    }

    public static void main(String[] args) {

        Starter barApplication = new Starter();
        barApplication.runtime();
    }
}
