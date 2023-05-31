package materials.lesson10;

public class Account {
    private static int id;
    private double balance;

    public Account(double balance) {
        id++;
        if (balance > 0) {
            this.balance = balance;
        }
    }

    void showInfo() {
        System.out.printf("id: %d %nbalance: %.2f%n", id, balance);
    }
}
