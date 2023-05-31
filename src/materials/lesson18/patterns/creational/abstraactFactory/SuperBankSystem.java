package materials.lesson18.patterns.creational.abstraactFactory;

import materials.lesson18.patterns.creational.abstraactFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getProjectManager();

        System.out.println("Bank System");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
