import java.util.HashMap;

/**
 * Purpose of this class is to host database of members and methods associated with it.
 */

public class DatabaseOfMembers {
    private HashMap<String, String> databaseOfMembers;

    public DatabaseOfMembers(){
        databaseOfMembers = new HashMap<>();
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
