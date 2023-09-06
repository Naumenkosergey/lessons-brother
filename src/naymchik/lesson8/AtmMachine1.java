package naymchik.lesson8;

import java.util.Scanner;

/**
 * Банкомат
 * Создать класс AtmMachine, описывающий банкомат.Набор купюр, находящихся в банкомате должен задаваться тремя
 * свойствами: количеством купюр номиналом 20, 50 и 100.
 * - Сделать методы для добавления денег в банкомат.
 * - Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность
 * выполнения операции. При снятии денег функция должна распечатывать каким количеством купюр какого номинала
 * выдаётся сумма. Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class AtmMachine1 {
    int banknote20;
    int banknote50;
    int banknote100;

    public AtmMachine1() {
    }

    public AtmMachine1(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    private void AddAtmMachine(int banknote20, int banknote50, int banknote100) {
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
    }

    private boolean WithdrawMoney(int summa) {
        int summaATM = this.banknote20 * 20 + this.banknote50 * 50 + this.banknote100 * 100;
        if (summaATM < summa) {
            System.out.println("В банкомате недостаточно средст");
            return false;
        } else if (summa == 10 || summa == 30) {
            System.out.println("Банкомат не может выдать такую сумму. Измените сумму");
        } else {
            int money = 0;
            int n100 = 0;
            int n50 = 0;
            int n20 = 0;

            while (summa >= money) {
                if (summa >= (n100 + 1) * 100 && this.banknote100 != n100) {
                    n100++;
                    money += 100;
                } else break;
            }
            while (summa >= money) {
                if (summa >= n100 * 100 + (n50 + 1) * 50 && this.banknote50 != n50) {
                    n50++;
                    money += 50;
                } else break;
            }
            while (summa >= money) {
                if (summa >= n100 * 100 + n50 * 50 + (n20 + 1) * 20 && this.banknote20 != n20) {
                    n20++;
                    money += 20;
                } else break;
            }
            if ((summa - money) == 10 && n50 >= 1 && this.banknote20 >= 3) {
                n50--;
                n20 += 3;
                money = n100 * 100 + n50 * 50 + n20 * 20;
            } else if ((summa - money) == 30 && n50 >= 1 && this.banknote20 >= 4) {
                n50--;
                n20 += 4;
                money = n100 * 100 + n50 * 50 + n20 * 20;
            } else if ((summa - money) == 10 && n100 >= 1 && this.banknote20 >= 3 && this.banknote50 >= 1) {
                n100--;
                n50++;
                n20 += 3;
                money = n100 * 100 + n50 * 50 + n20 * 20;
            } else if ((summa - money) == 30 && n100 >= 1 && this.banknote20 >= 3 && this.banknote50 >= 1) {
                n100--;
                n50++;
                n20 += 4;
                money = n100 * 100 + n50 * 50 + n20 * 20;
            }

            if (summa == money) {
                this.banknote100 -= n100;
                this.banknote50 -= n50;
                this.banknote20 -= n20;

                System.out.printf("100-%dшт; 50-%dшт; 20-%dшт; Итого=%d\n", n100, n50, n20, money);
            } else {
                System.out.println("Измените сумму");
            }
            return (summa == money);
        }
        return true;
    }

    private void PrintAtmMachine() {
        System.out.printf("100-%dшт; 50-%dшт; 20-%dшт; В банкомате средств - %d\n", banknote100, banknote50, banknote20,
                (banknote100 * 100 + banknote50 * 50 + banknote20 * 20));
    }


    public static void main(String[] args) {
        AtmMachine1 ATM1 = new AtmMachine1(10, 10, 10);
        ATM1.PrintAtmMachine();
        AtmMachine1 ATM2 = new AtmMachine1(0, 0, 0);
        ATM2.PrintAtmMachine();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите сумму которую хотите снять");
        int summa = scan.nextInt();

        ATM1.WithdrawMoney(summa);
        ATM1.PrintAtmMachine();
        ATM1.AddAtmMachine(4, 10, 0);
        ATM1.PrintAtmMachine();
        ATM2.WithdrawMoney(170);
        ATM2.PrintAtmMachine();
    }
}