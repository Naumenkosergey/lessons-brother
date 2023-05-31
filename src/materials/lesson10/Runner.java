package materials.lesson10;

public class Runner {

    public static void main(String[] args) {
        Account account = new Account(50);
        account.showInfo();

        System.out.println("Вмешался }{AcKeR");
        Hacker hacker = new Hacker(account);
        account = hacker.updateBalance(1);

        account.showInfo();
    }
}
