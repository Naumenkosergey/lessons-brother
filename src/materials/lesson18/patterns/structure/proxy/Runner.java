package materials.lesson18.patterns.structure.proxy;

public class Runner {
    public static void main(String[] args) {

        Project project = new ProxyProject("url...");
        project.run();
    }
}
