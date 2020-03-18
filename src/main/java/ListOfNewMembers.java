/**
 * Purpose of this class is to host database of new members.
 */

import java.util.Arrays;

public class ListOfNewMembers {

    private Member[] members;

    @Override
    public String toString() {
        return "members=" + "[" + Arrays.toString(members) + "]";
    }

    public Member[] getMembers()
    {
        return members;
    }

}
