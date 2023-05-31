package materials.lesson18.patterns.creational.factoryMethod;

public class CppDevrloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDevaloper();
    }
}
