package naymchik.lesson5;

import java.util.Scanner;

/**
 * Создать класс CalcNumber в нем реализовать следующее задачи
 * Задание 4. Написать метод static int sumSequence(int n, int k), который выводит сумму последовательности чисел
 * от n до k включительно.
 * Задание 5. Написать метод static int mulSequence (int n, int k), который выводит произведение последовательности чисел
 * от n до k невключительно.
 * Задание 5. Написать метод static int factorial(int n), который выводит факториал числа n. n! = 1*2*3*4*5*…*
 * Задание 6. Написать метод static int sumEven(int n, int k), который выводит сумму четных чисел последовательности
 * от n до k включительно
 * Задание 7. Написать метод static int sumOdd(int n, int k), который выводит сумму нечетных чисел последовательности
 * от n до k включительно
 */
public class CalcNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

//        int n = 2;
//        int k = 5;
        System.out.println("Сумма: " + sumSequence(n, k));
//        sumSequenceWhile(n, k);
        System.out.println("Произведение: " + mulSequence(n, k));
//        System.out.println(mulSequenceFor(n, k));
        System.out.println(+n + "! = " + factorial(n));
//        System.out.println(factorialWhile(n));
        System.out.println("Сумма четных: " + sumEven(n, k));
//        System.out.println(sumEvenFor(n, k));
        System.out.println("Сумма нечетных: " + sumOdd(n, k));
    }


    static int sumSequence(int n, int k) {
        int summ;
        for (summ = 0; n <= k; n++) {
            summ += n;

        }
        return summ;
    }

    static int sumSequenceWhile(int n, int k) {
        int summ = 0;
        while (n <= k) {
            summ += n;
            n++;
        }
        return summ;
    }

    static int mulSequence(int n, int k) {
        int result = 1;
        while (n < k) {
            result *= n;
            n++;
        }
        return result;
    }

    static long mulSequenceFor(int n, int k) {
        long result;
        for (result = 1; n < k; n++) {
            result *= n;
        }
        return result;
    }

    static long factorial(int n) {
        long factor = 1;
        for (int i = n; i >= 1; i--) {
            factor *= i;

        }
        return factor;
    }

    static long factorialWhile(int n) {
        long factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        return factorial;

    }

    static int sumEven(int n, int k) {
        int summ = 0;
        while (n <= k) {
            if (n % 2 != 0) {
                n++;
                continue;
            }
            summ += n;
            n++;
        }
        return summ;
    }

    static int sumEvenFor(int n, int k) {
        int summ;
        for (summ = 0; n <= k; n++) {
            if (n % 2 != 0) {
                continue;
            }
            summ += n;

        }
        return summ;
    }

    static int sumOdd(int n, int k) {
        int summ = 0;
        while (n <= k) {
            if (n % 2 == 0) {
                n++;
                continue;
            }
            summ += n;
            n++;
        }
        return summ;
    }
}
