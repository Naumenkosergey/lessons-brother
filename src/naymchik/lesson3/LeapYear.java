package naymchik.lesson3;
/**
 * 5. Создать класс LeapYear, в котором реализовать возможность вводить целое число (год), сделать проверку на положительное,
 * если положительное, то выполнить проверку является ли високосным. Високосным годом является каждый четвёртый год,
 * за исключением столетий, которые не кратны 400.
 * Пример ввод: 25
 * вывод: Невисокосный
 * Пример ввод: 1800
 * вывод: Невисокосный
 * Пример ввод: 2000
 * вывод: Високосный
 * Пример ввод: -2000
 * вывод: Год не может быть отрицательным
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        if (value < 0) {
            System.out.println("Год не может быть отрицательным");
        } else {
            System.out.println(checkYear(value));
        }
    }

    public static String checkYear(int value) {
        return (value % 400 == 0 || (value % 4 == 0 && value % 100 != 0)) ? "Високосный" : "Невисокосный";
    }
}
