package materials.lesson08;

public class User {
    String name;
    byte age;
    int height;

    public User(String name, byte age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User(byte age, int height, String name){
        this(name, age, height);
    }
    public User(int height, byte age, String name){
        this(name, age, height);
    }
    public User(byte age, String name, int height){
        this(name, age, height);
    }
    public User(int height, String name, byte age){
        this(name, age, height);
    }
    public User( String name, int height, byte age){
        this(name, age, height);
    }

    public static void main(String[] args) {
        User user = new User("user", (byte) 5, 145);
        User user2 = new User((byte) 5, 145, "user");
        User user3 = new User( 145, (byte) 5,"user");
        User user4 = new User((byte) 5, "user", 145);
        User user5 = new User(145, "user", (byte) 5);
        User user6 = new User("user", 145, (byte) 5);
    }
}
