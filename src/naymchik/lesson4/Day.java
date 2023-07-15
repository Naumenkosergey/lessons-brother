package naymchik.lesson4;

import java.util.Scanner;

/**
 * 1. Написать класс Day, в котором реализовать возможность пользователю ввести целое число, которое является номером дня,
 * вывести на экран название этого дня, в классе должен быть метод private static void printDay(int day) - для данного задания
 * public static String getNameDay(int day) - можно использовать дальше
 */
public class Day {
    public static void main(String[] args) {
//        int a = 4;
//        getNameDay(a);
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        printDay(day);
    }

    private static void printDay(int day) {
        System.out.println(getNameDay(day));
    }

    public static String getNameDay(int day) {
        return switch (day) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "null";
        };
    }
}

