/**
 * Purpose of this class is to start application and to keep it opened until the database is not loaded (so far)
 */

public class Starter {

    DatabaseOfMembers databaseOfMembers;
    Keyboard commandKeyboard;
    Texts screenWriter;

    public Starter()
    {
        databaseOfMembers = new DatabaseOfMembers();
        commandKeyboard = new Keyboard();
        screenWriter = new Texts();
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
