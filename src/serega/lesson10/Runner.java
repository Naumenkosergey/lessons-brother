package serega.lesson10;

import serega.lesson10.Account;

public class Runner {
    public static void main(String[] args) {
        int t = 4;
        Account account = new Account(1, 20);
        Account account2 = new Account(1, 20);
        account.showInfo();
        account.setBalance(23);
        System.out.println(account.getBalance());
        //account.updateBalance(-23);

        Hacker hacker = new Hacker();
        hacker.updateBalance(account);
        System.out.println(account.equals(account2));

        account.showInfo();
    }
}
