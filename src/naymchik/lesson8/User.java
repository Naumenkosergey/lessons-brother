package naymchik.lesson8;

/**
 * Сайт знакомств
 * Представьте, что вы создаете базу данных пользователей для сайта знакомств. Да вот беда — вы подзабыли в
 * каком порядке их нужно указывать, а технического задания под рукой нет. Спроектируйте класс User, у которого
 * будут поля — имя (String) возраст (byte) и рост (int). Создайте для него необходимое количество конструкторов,
 * чтобы имя, возраст и рост можно было указывать в любом порядке. В методе main() создай объекты, используя разные
 * конструкторы.
 */


public class User {
    String name;
    byte age;
    int height;

    public User(String name, byte age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(String name, int height, byte age) {
        this(name, age, height);
    }

    public User(int height, String name, byte age) {
        this(name, age, height);
    }

    public User(byte age, String name, int height) {
        this(name, age, height);
    }


    public User(int height, byte age, String name) {
        this(name, age, height);
    }

    public User(byte age, int height, String name) {
        this(name, age, height);
    }

    public String toString() {
        return "Пользователь: " + name + "; Возраст - " + age + "; Рост - " + height;
    }


    public static void main(String[] args) {
        User Yra = new User("Юрий", (byte) 33, 192);
        User Gena = new User("Гена", 172, (byte) 28);
        User Kachai = new User((byte) 10, "Екатерина", 168);
        User Ylai = new User(150, "Юля", (byte) 30);
        User Anna = new User((byte) 25, 165, "Анна");
        User Anton = new User(152, (byte) 17, "Анна");

        System.out.println(Yra);
        System.out.println(Gena);
        System.out.println(Kachai);
        System.out.println(Ylai);
        System.out.println(Anna);
        System.out.println(Anton);
    }


}
