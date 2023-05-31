package materials.lesson18.patterns.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Команда создала проект...");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
