import java.util.HashMap;

/**
 * Purpose of this class is to host database of members and methods associated with it.
 */

public class DatabaseOfMembers {
    private HashMap<String, String> databaseOfMembers;
    IOoperations ioManager;

    public DatabaseOfMembers(){
        databaseOfMembers = new HashMap<>();
        ioManager = new IOoperations();
    }

    public void addNewMembers()
    {
        Member[] newMembersList = ioManager.loadNewMembers();

        for(int counter = 0; counter < newMembersList.length; counter++)
        {
            String id = newMembersList[counter].getId();
            String name = newMembersList[counter].getName();
            setDatabaseOfMembers(name, id);
        }
    }

    public void setDatabaseOfMembers(String name, String ID){
        if(databaseOfMembers.containsKey(ID)){
            System.out.println("ID " + ID + "is already used. User was not added.");
        } else {
            databaseOfMembers.put(ID, name);
            System.out.println("Added " + name + "to the database.");
        }
    }

}
