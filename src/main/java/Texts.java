/**
 * Purpose of this class is to provide texts for text interface of the application.
 */

public class Texts {
    public void welcomeText()
    {
        System.out.println("Welcome!");
        menuScreen();
    }
    public void questionAfterCommand(){
        System.out.println("\nWhat do you want to do next?");
    }
    public void menuScreen()
    {
        System.out.println("1) Load in a member file.\n" +
                "- Take the attendance.\n" +
                "- Save the attendance.\n" +
                "- Load the attendance.\n" +
                "- Add new member.\n" +
                "- Remove member.\n" +
                "0) Quit");
    }
    public void exitScreen()
    {
        System.out.println("You have chosen to quit. Have a nice day.");
    }
    public void wrongMenuInput()
    {
        System.out.println("I don't understand. You can choose between options 1 and 0.");
    }
}
