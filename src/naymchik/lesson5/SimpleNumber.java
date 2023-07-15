package naymchik.lesson5;

import java.util.Scanner;

/**
 * Создать класс SimpleNumber в нем реализовать следующую задачу:
 * Пользователь вводит число с клавиатуры, программа определяет является данное число простым или составным.
 * Простым число является тогда и только тогда, когда оно делится только на 1 и само на себя
 */
public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        returnPrimeNumber(value);
//        returnPrimeNumberFor(value);
    }

    public static void returnPrimeNumber(int value) {
        int a = 2;
        while (a <= Math.abs(value)) {
            if (a == Math.abs(value)) {
                System.out.println("Число " + value + " простое");
                break;
            } else if ( Math.abs(value) % a == 0) {
                System.out.println("Число " + value + " составное");
                break;
            } else {
                a++;
            }
        }
    }

    public static void returnPrimeNumberFor(int value) {
        for (int i = 2; i <= value; i++) {
            if (i == value) {
                System.out.println("число простое");
                break;
            } else if (value % i == 0) {
                System.out.println("число составное");
                break;
            }
        }
    }
}
