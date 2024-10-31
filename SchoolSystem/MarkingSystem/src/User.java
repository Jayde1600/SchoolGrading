public class User {
    protected String name;
    protected int id;

    public User(String name, int userId) {
        this.name = name;
        this.id = userId;
    }

    public void displayInfo() {

        System.out.println("Your Name Is " + name + " (ID: " + id + ")");
    }
}
