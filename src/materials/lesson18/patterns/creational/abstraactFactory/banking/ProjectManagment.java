package materials.lesson18.patterns.creational.abstraactFactory.banking;

import materials.lesson18.patterns.creational.abstraactFactory.ProjectManager;

public class ProjectManagment implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Pm work");
    }

}
