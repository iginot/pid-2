/**
 * Purpose of this class is to start application and to keep it opened until the database is not loaded (so far)
 */

public class Starter {
    public static void main(String[] args) {

        IOoperations app = new IOoperations();
        DatabaseOfMembers databaseOfMembers = new DatabaseOfMembers();
        Member[] newMembersList = app.loadNewMembers();

        for(int counter = 0; counter < newMembersList.length; counter++)
        {
            String id = newMembersList[counter].getId();
            String name = newMembersList[counter].getName();
            databaseOfMembers.setDatabaseOfMembers(name, id);
        }
    }
}
