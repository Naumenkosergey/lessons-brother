package materials.lesson18.patterns.creational.abstraactFactory.banking;

import materials.lesson18.patterns.creational.abstraactFactory.Developer;

public class KotlinDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("kotlin code writes");
    }
}
