package naymchik.lesson8;

/**
 * Банкомат
 * Создать класс AtmMachine, описывающий банкомат.Набор купюр, находящихся в банкомате должен задаваться тремя
 * свойствами: количеством купюр номиналом 20, 50 и 100.
 * - Сделать методы для добавления денег в банкомат.
 * - Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность
 * выполнения операции. При снятии денег функция должна распечатывать каким количеством купюр какого номинала
 * выдаётся сумма. Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class AtmMachine {
    int banknote10;
    int banknote20;
    int banknote50;
    int banknote100;

    public AtmMachine() {
    }

    public AtmMachine(int banknote10, int banknote20, int banknote50, int banknote100) {
        this.banknote10 = banknote10;
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    private void addAtmMachine(int banknote10, int banknote20, int banknote50, int banknote100) {
        this.banknote10 += banknote10;
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
    }

    private boolean withdrawMoney(int summa) {
        int summaATM = this.banknote10 * 10 + this.banknote20 * 20 + this.banknote50 * 50 + this.banknote100 * 100;
        if (summaATM < summa) {
            System.out.println("В банкомате недостаточно средст");
            return false;
        } else {
            int money = 0;
            int n100 = 0;
            int n50 = 0;
            int n20 = 0;
            int n10 = 0;

            while (summa >= money) {
                if (summa >= (n100 + 1) * 100) {
                    if (this.banknote100 == n100) {
                        break;
                    }
                    n100++;
                    money += 100;
                } else break;
            }
            while (summa >= money) {
                if (summa >= n100 * 100 + (n50 + 1) * 50) {
                    if (this.banknote50 == n50) {
                        break;
                    }
                    n50++;
                    money += 50;
                } else break;
            }
            while (summa >= money) {
                if (summa >= n100 * 100 + n50 * 50 + (n20 + 1) * 20) {
                    if (this.banknote20 == n20) {
                        break;
                    }
                    n20++;
                    money += 20;
                } else break;
            }
            while (summa >= money) {
                if (summa >= n100 * 100 + n50 * 50 + n20 * 20 + (n10 + 1) * 10) {
                    if (this.banknote10 == n10) {
                        break;
                    }
                    n10++;
                    money += 10;
                } else break;
            }
            if (summa == money) {
                this.banknote100 -= n100;
                this.banknote50 -= n50;
                this.banknote20 -= n20;
                this.banknote10 -= n10;
                System.out.printf("100-%dшт; 50-%dшт; 20-%dшт; 10-%dшт; Итого=%d\n", n100, n50, n20, n10, money);
            } else {
                System.out.println("Измените сумму");
            }
            return (summa == money);
        }

    }

    private void printAtmMachine() {
        System.out.printf("100-%dшт; 50-%dшт; 20-%dшт; 10-%dшт;\n", banknote100, banknote50, banknote20, banknote10);
    }

    public static void main(String[] args) {
        AtmMachine ATM1 = new AtmMachine(5, 10, 4, 2);
        ATM1.printAtmMachine();

        System.out.println(ATM1.withdrawMoney(70));
        ATM1.printAtmMachine();
        ATM1.addAtmMachine(4,10,0,0);
        ATM1.printAtmMachine();
    }
}