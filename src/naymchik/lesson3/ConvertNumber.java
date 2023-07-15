package naymchik.lesson3;

import java.util.Locale;
import java.util.Scanner;

/**
 * 2. Написать класс ConvertNumber, в котором реализовать возможность вводить целое число, а программа выдает
 * его дробное представление.
 */
public class ConvertNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int values = scan.nextInt();
        System.out.printf(Locale.ENGLISH, "%.1f", (double) values);
    }
}
