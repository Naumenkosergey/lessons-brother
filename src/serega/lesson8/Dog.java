package serega.lesson8;

public class Dog {

    String name;
    int age;
    int speed;


    public Dog() {

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
