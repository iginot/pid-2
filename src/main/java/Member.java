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
}