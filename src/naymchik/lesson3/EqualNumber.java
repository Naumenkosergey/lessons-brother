package naymchik.lesson3;

import java.util.Scanner;

/**
 * 3. Написать класс EqualNumber, в котором реализовать возможность вводить 3 целых числа. Программа ввыводит те числа
 * которые одинаковые, если таковых нет, то сообщение, "Одинаковых чисел нет"
 * Пример: ввод: 2 5 2
 * вывод: 2 2
 * Пример: ввод: 2 5 7
 * вывод: Одинаковых чисел нет
 */
public class EqualNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        int value3 = scan.nextInt();

        if (value1 == value2 && value2 == value3) {
            System.out.printf("%d %d %d\n", value1, value2, value3);
        } else if (value1 == value2 || value2 == value3 || value3 == value1) {
            sravnenie(value1, value2);
            sravnenie(value1, value3);
            sravnenie(value2, value3);
        } else
            System.out.println("Одинаковых чисел нет");
    }

    static void sravnenie(int a, int b) {
        if (a == b) {
            System.out.printf("%d %d\n", a, b);
        }
    }
}

