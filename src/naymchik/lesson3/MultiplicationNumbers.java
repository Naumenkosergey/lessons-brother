package naymchik.lesson3;

import java.util.Scanner;

/**
 * 12. Создать класс MultiplicationNumbers, в котром реализовать возможность ввести 2 целых цифры а и b. вывести на экран
 * их текстовые представления и их произведения также в текстовом представлении. Отрицательные не берем!!!
 * Пример ввод: 8 5
 * вывод: восемь умножить на пять равно сорок
 * Пример ввод: 0 7
 * вывод: ноль умножить на семь равно ноль
 * <p>
 * <p>
 * <p>
 * <p>
 * run("4\n3").include("четыре умножить на три равно двенадцать");
 * run("7\n3").include("семь умножить на три равно двадцать один");
 * run("15\n7").include("нужно вводить толко цифры, т.е. значения от 0 до 10");
 * run("2\n2").include("два умножить на два равно четыре");
 * run("0\n9").include("ноль умножить на девять равно ноль");
 */
public class MultiplicationNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        byte a = scan.nextByte();
        byte b = scan.nextByte();
        int c = a * b;

        if (a < 0 || a > 9 || b < 0 || b > 9) {
            System.out.println("нужно вводить толко цифры, т.е. значения от 0 до 10");
        } else if (chislo(c) == null) {
            String c1 = chislo((c / 10) * 10);
            String c2 = chislo(c % 10);
            System.out.printf("%s умножить на %s равно %s %s", chislo(a), chislo(b), c1, c2);
        } else {
            System.out.printf("%s умножить на %s равно %s", chislo(a), chislo(b), chislo(c));
        }
    }

    public static String chislo(int a) {

        return switch (a) {
            case 0 -> "ноль";
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "четыре";
            case 5 -> "пять";
            case 6 -> "шесть";
            case 7 -> "семь";
            case 8 -> "восемь";
            case 9 -> "девять";
            case 10 -> "десять";
            case 11 -> "одинадцать";
            case 12 -> "двенадцать";
            case 13 -> "тринадцать";
            case 14 -> "цетырнадцать";
            case 15 -> "пятнадцать";
            case 16 -> "шеснадцать";
            case 17 -> "семнадцать";
            case 18 -> "восемнадцать";
            case 19 -> "девятнадцать";
            case 20 -> "двадцать";
            case 30 -> "тридцать";
            case 40 -> "сорок";
            case 50 -> "пятьдесят";
            case 60 -> "шестьдесят";
            case 70 -> "семдесят";
            case 80 -> "восемьдесят";
            case 90 -> "девяносто";
            case 100 -> "сто";
            default -> null;
        };
    }
}
