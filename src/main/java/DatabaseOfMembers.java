import java.util.HashMap;
import java.util.ArrayList;

/**
 * Purpose of this class is to host database of members and methods associated with it.
 */

public class DatabaseOfMembers {
    private HashMap<String, String> databaseOfMembers;
    IOoperations ioManager;
    Texts screenWriter;

    public DatabaseOfMembers(){
        databaseOfMembers = new HashMap<>();
        ioManager = new IOoperations();
        screenWriter = new Texts();
    }

    public void addNewMembers()
    {
        Member[] newMembersList = ioManager.loadNewMembers();

        for(int counter = 0; counter < newMembersList.length; counter++)
        {
            String id = newMembersList[counter].getId();
            String name = newMembersList[counter].getName();
            if(databaseOfMembers.containsKey(id)){
                screenWriter.notAddedToDatabase(id, name);
            } else if(name.equals(null)) {
                System.out.println("name cannot be empty");
            } else {
                databaseOfMembers.put(id, name);
                screenWriter.addedToDatabase(name);
            }
        }
    }
    public ArrayList<String> getNames()
    {
        ArrayList<String> allMemberNames = new ArrayList<>();
        for (String key: databaseOfMembers.keySet()) {
            allMemberNames.add(databaseOfMembers.get(key));
        }
        return allMemberNames;
    }

}
