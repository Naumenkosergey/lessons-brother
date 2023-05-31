package materials.lesson18.patterns.creational.abstraactFactory;

import materials.lesson18.patterns.creational.abstraactFactory.banking.KotlinDeveloper;
import materials.lesson18.patterns.creational.abstraactFactory.banking.ManualTester;
import materials.lesson18.patterns.creational.abstraactFactory.banking.ProjectManagment;

public class WebSite {

    public static void main(String[] args) {
        KotlinDeveloper kotlinDelveloper = new KotlinDeveloper();
        ManualTester manualTester  = new ManualTester();
        ProjectManagment projectManagment = new ProjectManagment();

        System.out.println("Creating project...");
        kotlinDelveloper.writeCode();
        manualTester.testCode();
        projectManagment.manageProject();
    }
}
