package materials.lesson11;

public class Runner {
    public static void main(String[] args) {
        Person john = new Person("John");
        john.display();
        Employee den = new Employee("Den", "Google");
        den.display();
        System.out.println(den);
    }
}

class Person {
    private String name;

    public Person() {
        System.out.println("Сработал Person");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("Сработал Person");
    }

    public void display() {
        System.out.println("person: " + name);
    }

    public String getName() {
        return name;
    }
}


class Employee extends Person {

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
        System.out.println("Сработал Employee");
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void display() {
        super.display();
//        System.out.printf("Работник %s ", getName());
        System.out.printf("работает в %s\n", company);
    }

    @Override
    public String toString() {
        return String.format("работает в %s\n", company);
    }
}


