package serega.lesson8;

public class Dog extends Number {

    String name;
    int age;
    int speed;


    public Dog() {

    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, int speed) {
        this(name, age);
        this.speed = speed;
    }

    public boolean catching(Cat cat){
        return this.speed > cat.speed;
    }

    static boolean danger(Dog dog1, Dog dog2){
        return dog1.age < dog2.age;
    }

    boolean danger(Dog other){
       return this.age < other.age;
    }
}
