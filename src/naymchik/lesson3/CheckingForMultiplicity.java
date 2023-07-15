package naymchik.lesson3;

import java.util.Scanner;

/**
 * 11. Создать класс CheckingForMultiplicity, в котором реализовать возможность ввести 2 целых числа n и k, программа
 * должна проверить является ли число n кратное k (т.е. делится ли n на k).
 * ответ вывести в дите "Число {n} (не)кратное {k}"
 */

public class CheckingForMultiplicity {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        if (n % k == 0) {
            System.out.printf("Число %d кратное %d", n, k);
        } else {
            System.out.printf("Число %d некратное %d", n, k);
        }
    }
}
