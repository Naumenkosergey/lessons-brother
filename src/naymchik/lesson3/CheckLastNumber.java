package naymchik.lesson3;

import java.util.Scanner;

/**
 * 9. Создать класс CheckLastNumber, в котором реалиовать возможность вводить 2 целых числа n и k.
 * Программа определяет явлеяется ли последняя цифра числа n равным k, если да то вывести строку, при этом k не
 * может быть отрицательным и больше 9, при таком случае вывести сообщение.
 * "Цифра {k} является последней числа {n}", если нет, то "Цифра {k} не является последней числа {n}"
 */
public class CheckLastNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        byte k = scan.nextByte();

//        int n = -28912;
//        byte k = 2;

        if (k < 0 || k > 9) {
            System.out.println("Число к не может быть отрицательным и больше 9");
        } else if (Math.abs(n % 10) == k) {
            System.out.printf("Цифра %d является последней числа %d ", k, n);
        } else {
            System.out.printf("Цифра %d не является последней числа %d ", k, n);
        }


    }
}
