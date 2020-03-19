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
                "2) Take the attendance.\n" +
                "3) View the attendance.\n" +
                "4) Save the attendance.\n" +
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
        System.out.println("I don't understand. You can choose between options 1, 2, 3, 4 and 0.");
    }
    public void notAddedToDatabase(String id)
    {
        System.out.println("ID " + id + " is already used. User was not added.");
    }
    public void addedToDatabase(String name)
    {
        System.out.println("Added " + name + " to the database.");
    }
    public void doesMemberAttended(String name)
    {
        System.out.println("Has " + name + " attended?\n" +
                "Yes - press 1\n" +
                "No  - press any other key");
    }
    public void attendanceExportedSuccessfully()
    {
        System.out.println("Attendance was exported successfully.");
    }
    public void attendanceExportFailed()
    {
        System.out.println("Attendance export has failed.");
    }
    public void membersImportFailed()
    {
        System.out.println("Import of new members has failed.");
    }

}
