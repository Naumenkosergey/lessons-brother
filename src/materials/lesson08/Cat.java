package materials.lesson08;

public class Cat {
    String name;
    byte age;

    public Cat(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Cat(byte age, String name) {
        this(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", (byte) 3);
        Cat cat2 = new Cat((byte) 3, "Мурзик");

        System.out.println(cat);
        System.out.println(cat2);
    }
}



