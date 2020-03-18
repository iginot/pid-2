/**
 * Purpose of this class is to store information about individual members and provide methods to access them.
 */

public class Member {
    private String name;
    private String id;

    public Member(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Member [name=" + name + ", id=" + id + "]";
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }
}