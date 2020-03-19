/**
 * Purpose of this class is to provide texts for text interface of the application.
 */

public class Texts {
    public void welcomeText()
    {
        System.out.println( "------------------------------------------------------\n" +
                            "Welcome to the best application for taking attendance!\n" +
                            "------------------------------------------------------\n" +
                            "You can choose from following options:");
        menuScreen();
    }
    public void questionAfterCommand(){
        System.out.println("\nWhat do you want to do next?");
    }
    public void menuScreen()
    {
        System.out.println("1) Load the file of members.\n" +
                "2) Take the attendance.\n" +
                "3) Display the attendance.\n" +
                "4) Save the attendance to a file.\n" +
                "5) Load and display the attendance.\n" +
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
        System.out.println("I don't understand. You can choose between options 1, 2, 3, 4, 5 and 0.");
    }
    public void notAddedToDatabase(String id, String name)
    {
        System.out.println("User " + name + " was not added to the database because ID " + id + " is already used.");
    }
    public void addedToDatabase(String name)
    {
        System.out.println(name + " has been added to the database.");
    }
    public void doesMemberAttended(String name)
    {
        System.out.println("Has " + name + " attended?\n" +
                "Yes - press 1\n" +
                "No  - press any other key");
    }
    public void attendanceExportedSuccessfully()
    {
        System.out.println("Attendance file was created successfully.");
    }
    public void attendanceExportFailed()
    {
        System.out.println("Save of file failed. Please, check out webside for suggestions or contact our HelpDesk.");
    }
    public void membersImportFailed()
    {
        System.out.println("Loading of members file failed.");
    }
    public void attendanceImportedSuccessfully()
    {
        System.out.println("Attendance file was imported successfully.");
    }
    public void attendanceImportFailed()
    {
        System.out.println("Loading of attendance file failed. You can take the attendance manually by pressing 2.");
    }
    public void attendanceHeader()
    {
        System.out.println("Current status of members' attendance is:\n" +
                            "-----------------------------------------\n"+
                "status\t\t\tname");
    }
    public void attendedMember(String name)
    {
        System.out.println("attended\t\t" + name);
    }
    public void notAttendedMember(String name)
    {
        System.out.println("not attended\t" + name);
    }
    public void attendanceRecorded()
    {
        System.out.println("\nAttendance was recorded successfully.");
    }

}
