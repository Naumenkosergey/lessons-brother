package materials.lesson18.patterns.creational.prototype;

public class ProjectFactory {

    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project cloneProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
