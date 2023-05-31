package materials.lesson18.patterns.creational.prototype;

public class Runner {

    public static void main(String[] args) {
        Project master = new Project(1, "project1", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);
        System.out.println("=========================");
        ProjectFactory factory = new ProjectFactory(master);
//        Project masterClone = (Project) master.copy();
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }
}
