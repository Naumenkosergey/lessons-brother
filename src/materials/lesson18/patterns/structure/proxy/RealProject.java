package materials.lesson18.patterns.structure.proxy;

public class RealProject implements Project {

    String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    void load() {
        System.out.println("Project loading....");
    }

    @Override
    public void run() {
        System.out.println("Project runining....");

    }
}
