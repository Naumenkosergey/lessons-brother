package naymchik.lesson4;

import java.util.Map;
import java.util.Scanner;

/**
 * 2. Написать класс FindMinMaxValue. пользователь вводит 4 целых числа, программа находит минимальный и максимальный
 * среди них. В классе должно быть два метода private static int findMin(int a, int b) и private static int findMax(int a, int b)
 */
public class FindMinMaxValue {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
//
//        int a = 150;
//        int b = 45;
//        int c = 43;
//        int d = 13;

        System.out.println("min: " + findMin(findMin(a, b), findMin(c, d)));
        System.out.println("max: " + findMax(findMax(a, b), findMax(c, d)));


    }

    private static int findMin(int a, int b) {
        return Math.min(a, b);
    }

    private static int findMax(int a, int b) {
        return a > b ? a : b;
    }


//private static int findMin(int a, int b) {
//    Math.min(a, b)
//    };

}
