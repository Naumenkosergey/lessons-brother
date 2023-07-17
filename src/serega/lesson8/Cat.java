package serega.lesson8;

public class Cat {

    public static int COUNT;

    String name;
    int age;
    int speed = 10;


    public Cat() {
        COUNT++;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        COUNT++;
    }

    public Cat(String name, int age, int speed) {
        this(name, age);
        this.speed = speed;
    }

    public Cat(int age, String name) {
        this(name, age);
    }

    public static void info() {
        System.out.println("было создано " + COUNT + "котов");
    }

    public void say(){
        System.out.println("кот по имени " + this.name + " говорит Мяу");
    }

    public void say(int  n){
        System.out.println("кот по имени " + this.name + " говорит Мяу-мяу");
    }

    public String toString(){
        return "Котик по имени " + this.name + " возраст " + this.age;
    }


}
