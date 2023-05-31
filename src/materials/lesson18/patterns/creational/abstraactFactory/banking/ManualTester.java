package materials.lesson18.patterns.creational.abstraactFactory.banking;

import materials.lesson18.patterns.creational.abstraactFactory.Tester;

public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("test manual work");
    }
}
