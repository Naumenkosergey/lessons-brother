package naymchik.lesson3;

import java.util.Scanner;

/**
 * 4. Написать класс SumOfDigits, в котором реализовать возможность вводить 1 целое четырехзначное число. Программа должна
 * проверять является ли оно четырех значным если да то считать сумму его цифр, иначе выводить сообщение
 * "Число не четырехзначное"
 * Пример: ввод: 7548
 * вывод: 24
 * Пример: ввод: 12
 * вывод: Число не четырехзначное
 * Пример: ввод: -1234
 * вывод: -10
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        if (value >= 1000 && value < 10000 || value <= -1000 && value > -10000) {
            System.out.println(summaChisel(value));
        } else System.out.println("Число не четырехзначное");
    }

    public static int summaChisel(int value) {
        int summ = 0;
        for (int correctValue = value; correctValue != 0; correctValue /= 10) {
            summ += correctValue % 10;
        }
        return summ;
    }

    public static int summaChiselWhile(int value) {
        int summ = 0;
        while (value > 0) {
            if (value % 10 == 4) {
                value /= 10;
                continue;
            }
            summ += value % 10;
            value /= 10;
        }
        return summ;
    }
}
