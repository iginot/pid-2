import java.util.Arrays;

public class ListOfMembers {

    private Member[] members;

    @Override
    public String toString() {
        return "members=" + "[" + Arrays.toString(members) + "]";
    }



    public void test()
    {
        System.out.println("was here");
    }

    public void length()
    {
        System.out.println(members.length);
    }

}
