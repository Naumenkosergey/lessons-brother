package materials.lesson18.patterns.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactoryFlyweight {

    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperSpecialty(String specialty) {
        Developer developer = developers.get(specialty);
        if (developer == null) {
            switch (specialty) {
                case "java": {
                    System.out.println("Нанимаем Java разработчика");
                    developer = new JavaDeveloper();
                    break;
                }
                case "c++": {
                    System.out.println("Нанимаем C++ разработчика");
                    developer = new CppDeveloper();
                    break;
                }
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
