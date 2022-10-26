package src.objects;

public class User {
    private static int count;

    private String name;
    private int id;

    public User(String name) {
        this.name = name;
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
