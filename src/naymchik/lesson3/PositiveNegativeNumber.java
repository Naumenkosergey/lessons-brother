package naymchik.lesson3;

import java.util.Scanner;

/**
 * 1. Написать класс PositiveNegativeNumber, в котором реализовать возможность вводить целое число,
 * а программа определяет какое оно положительное, отрицательное или ноль, программа выводит одну из строки
 * "Число положительное", "Число отрицательное", "Число ноль".
 */

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int namber1 = scan.nextInt();


        if (namber1 > 0) {
            System.out.println("Число положительное");
        }
        else if (namber1 < 0) {
            System.out.println("Число отрицательное");
        }
        else{
            System.out.println("Число ноль");
        }

    }
}
