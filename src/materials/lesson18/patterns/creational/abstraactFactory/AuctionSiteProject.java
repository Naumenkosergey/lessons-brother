package materials.lesson18.patterns.creational.abstraactFactory;

import materials.lesson18.patterns.creational.abstraactFactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getProjectManager();

        System.out.println("website auction");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
