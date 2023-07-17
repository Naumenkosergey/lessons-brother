package naymchik.lesson5;

import java.util.Scanner;

/**
 * Создать класс PrintNumber в нем реализовать следующее задачи:
 * Задание 1. Написать метод static void printNumberFromZeroToTenInclude(int n), который выводит числа от 0 до
 * n включительно, через пробел.
 * Задание 2. Написать метод static void printNumberFromTenToZeroExclude(int n), который выводит числа от n до
 * 0 невключительно, через пробел.
 * Задание 3. Написать метод static void printNumberFromNToKStep(int n, int k, int step), который выводит
 * числа от n до k включительно c шагом step, значения n k step – пользователь вводит с клавиатуры.
 */
public class PrintNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int step = scan.nextInt();
        printNumberFromZeroToTenInclude(n);
        System.out.println();
        printNumberFromTenToZeroExclude(n);
        System.out.println();
        printNumberFromNToKStep(n, k, step);
    }

    static void printNumberFromZeroToTenInclude(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    static void printNumberFromZeroToTenIncludeWhile(int n) {
        int peremennau = 0;
        while (peremennau <= n) {
            System.out.print(peremennau + " ");
            peremennau++;
        }
    }

    static void printNumberFromTenToZeroExclude(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    static void printNumberFromTenToZeroExcludeWhile(int n) {
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
    }

    static void printNumberFromNToKStep(int n, int k, int step) {
        for (int i = n; i <= k; i += step) {
            System.out.print(i + " ");
        }
    }
}
