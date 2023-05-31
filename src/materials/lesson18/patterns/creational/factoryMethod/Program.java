package materials.lesson18.patterns.creational.factoryMethod;

public class Program {
    public static void main(String[] args) {
//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeCode();
//
//        CppDevaloper cppDevaloper = new CppDevaloper();
//        cppDevaloper.writeCode();

//        Developer developer = new CppDevaloper();
//        developer.writeCode();

        DeveloperFactory developerFactory = createDeveloperBySpecialty("CpP");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    //метод абстрактной фабрика "Фабричный бетод"
    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        switch (specialty.toLowerCase()) {
            case "java":
                return new JavaDeveloperFactory();
            case "cpp":
                return new CppDevrloperFactory();
            case "php":
                return new PhpDeveloperFactory();
            default:
                throw new RuntimeException(specialty + " is unknown speciality.");
        }
    }
}
