package materials.lesson18.patterns.creational.abstraactFactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
