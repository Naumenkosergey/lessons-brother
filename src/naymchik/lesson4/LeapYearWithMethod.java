package naymchik.lesson4;

import java.util.Scanner;

/**
 * 5. Создать класс LeapYearWithMethod, в котором реализовать возможность вводить целое число (год), сделать проверку на положительное,
 * если отрицательное, то выполнить проверку является ли високосным. Високосным годом является каждый четвёртый год,
 * за исключением столетий, которые не кратны 400. весь код запишныть в медод public static String leapYear(int year),
 * можно будет использовать дальше
 * Пример ввод: 25
 * вывод: Невисокосный
 * Пример ввод: 1800
 * вывод: Невисокосный
 * Пример ввод: 2000
 * вывод: Високосный
 * Пример ввод: -2000
 * вывод: Год не может быть отрицательным
 */
public class LeapYearWithMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(leapYear(year));

    }

    public static String leapYear(int year) {
        if (year < 0) {
            return "Год не может быть отрицательным";
        } else {
            return ((year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) ? "Високосный" : "Невисокосный");
        }
    }
}
