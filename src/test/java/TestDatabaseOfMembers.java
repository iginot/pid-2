import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestDatabaseOfMembers {
    DatabaseOfMembers databaseOfMembers = new DatabaseOfMembers();

    @Test
    public void testGettingFromEmptyDatabase(){
        ArrayList<String> membersNames = databaseOfMembers.getNames();
        assertEquals(0, membersNames.size());
    }

    @Test
    public void testAddingNewMembers(){
        ArrayList<String> membersNames = new ArrayList<>();
        int membersNamesSizeBeforeAdding = membersNames.size();
        databaseOfMembers.addNewMembers();
        membersNames = databaseOfMembers.getNames();
        int membersNamesSizeAfterAdding = membersNames.size();
        assertTrue(membersNamesSizeAfterAdding > membersNamesSizeBeforeAdding);
    }

    @Test
    public void testAddingTwiceTheSameNewMembers(){
        databaseOfMembers.addNewMembers();
        ArrayList<String> membersNames = databaseOfMembers.getNames();
        int membersNamesSizeAddingOnce = membersNames.size();
        databaseOfMembers.addNewMembers();
        membersNames = databaseOfMembers.getNames();
        int membersNamesSizeAddingTwice = membersNames.size();
        assertEquals(membersNamesSizeAddingTwice, membersNamesSizeAddingOnce);
    }
}
