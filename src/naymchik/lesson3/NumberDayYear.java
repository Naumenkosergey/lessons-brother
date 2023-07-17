package naymchik.lesson3;

import java.util.Scanner;

/**
 * 10.Создать класс NumberDayYear, в котором реализовать возможность ввести пользователю 3 целых числа
 * год, месяц, день, программа должна считать данные и по данным вывести порядковый день данного года, при этом учесть
 * високосный год, также учесть что пользователь может ввести отрицательные числа, перевести их в положительные.
 */
public class NumberDayYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = Math.abs(scan.nextInt());
        int mouht = Math.abs(scan.nextInt());
        int year = Math.abs(scan.nextInt());
        byte k = (LeapYear.checkYear(year).equals("Високосный")) ? (byte) 1 : 0;

        int colichestvoDnei = switch (mouht) {
            case 1 -> 0;
            case 2 -> 31;
            case 3 -> 31 + 28 + k;
            case 4 -> 31 + 28 + k + 31;
            case 5 -> 31 + 28 + k + 31 + 30;
            case 6 -> 31 + 28 + k + 31 + 30 + 31;
            case 7 -> 31 + 28 + k + 31 + 30 + 31 + 30;
            case 8 -> 31 + 28 + k + 31 + 30 + 31 + 30 + 31;
            case 9 -> 31 + 28 + k + 31 + 30 + 31 + 30 + 31 + 31;
            case 10 -> 31 + 28 + k + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            case 11 -> 31 + 28 + k + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            case 12 -> 31 + 28 + k + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            default -> 0;
        };
        System.out.println(colichestvoDnei + day);
    }
}
