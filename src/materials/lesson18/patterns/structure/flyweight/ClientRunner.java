package materials.lesson18.patterns.structure.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ClientRunner {
    public static void main(String[] args) {
        DeveloperFactoryFlyweight developerFlyweight = new DeveloperFactoryFlyweight();

        List<Developer> developers = new ArrayList<>();
        developers.add(developerFlyweight.getDeveloperSpecialty("java"));
        developers.add(developerFlyweight.getDeveloperSpecialty("java"));
        developers.add(developerFlyweight.getDeveloperSpecialty("java"));
        developers.add(developerFlyweight.getDeveloperSpecialty("java"));
        developers.add(developerFlyweight.getDeveloperSpecialty("java"));
        developers.add(developerFlyweight.getDeveloperSpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperSpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperSpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperSpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperSpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperSpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperSpecialty("c++"));
        developers.add(developerFlyweight.getDeveloperSpecialty("c++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
