package naymchik.lesson5;

import java.util.Scanner;

public class ThimbleGame {
    public static void main(String[] args) {
        int bank = 1000;
        while (bank > 0) {
            int stavka = getStavka(bank);
            if (stavka == 0) {
                System.out.printf("Жаль что так быстро, заходите ещё. Выйгрыш составил %d\n", bank);
                break;
            }
            int chislo = hidderNumber();
            int a = (int) (Math.random() * 3 + 1);
            if (chislo == a) {
                bank += stavka;
                System.out.printf("Ура, Вы победили! Теперь на счету %d\n", bank);
            } else {
                bank -= stavka;
                System.out.printf("Загаданное число %d. Попробуйте еще раз! На счету %d\n", a, bank);
                if (bank == 0) {
                    System.out.println("На счету не осталось средств, заходите ещё!");
                    break;
                }
            }
        }
    }

    private static int hidderNumber() {
        System.out.println("Загадайте чисто от 1 до 3 включительно");
        return returnExpression();
    }

    private static int getStavka1(int bank) {
        System.out.println("Сделайте ставку");
        int stavka = returnExpression();
        if (stavka > 0 && stavka <= bank) {
            System.out.printf("Ставка в %d едениц принята\n", stavka);
        } else {
            while (stavka > bank || stavka <= 0) {
                if (stavka == 0) {
                    break;
                } else {
                    System.out.printf("Ставка не принята, у Вас осталось %d едениц\n", bank);
                    System.out.println("Сделайте ставку");
                    stavka = returnExpression();
                }
            }
            System.out.printf("Ставка в %d едениц принята\n", stavka);
        }
        return stavka;
    }

    private static int getStavka(int bank) {
        int stavka;
        do {
            System.out.println("Сделайте ставку");
            stavka = returnExpression();
            if (stavka < 0 || bank < stavka) {
                System.out.printf("Ставка не принята, у Вас осталось %d едениц\n", bank);
            } else if (stavka > 0) {
                System.out.printf("Ставка в %d едениц принята\n", stavka);
            } else {
                break;
            }
        } while (stavka > bank || stavka < 0);
        return stavka;
    }

    private static int returnExpression() {
        return new Scanner(System.in).nextInt();
    }
}
