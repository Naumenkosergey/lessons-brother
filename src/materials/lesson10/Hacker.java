package materials.lesson10;

public class Hacker {
    Account account;

    public Hacker(Account account) {
        this.account = account;
    }

    public Account updateBalance(double money) {
        return new Account(money);
    }
}
