package naymchik.lesson4;

import java.util.Scanner;

/**
 * 7. Создать класс MultiplicationNumbersModification, в котром реализовать возможность ввести 2 целых числа а и b
 * (небольше 10). вывести на экран  их текстовые представления и их произведения также в текстовом представлении.
 * Отрицательные берем !!! Наличее метода обязательно
 * public static String convertNumberToString(int number)
 * <p>
 * Пример ввод: 8 5
 * вывод: восемь умножить на пять равно сорок
 * Пример ввод: 0 7
 * вывод: ноль умножить на семь равно ноль
 * Пример ввод: -1 7
 * вывод: минус один умножить на семь равно минус семь
 * Пример ввод: -6 -7
 * вывод: минус шесть умножить на минус семь равно тридцать
 */
public class MultiplicationNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a * b;

        if (convertNumberToString((c)) != null) {
            System.out.printf("%s умножить на %s равно %s", convertNumberToString(a), convertNumberToString(b),
                    convertNumberToString(c));
        } else {
            System.out.printf("%s умножить на %s равно %s %s", convertNumberToString(a), convertNumberToString(b),
                    convertNumberToString(c / 10 * 10), convertNumberToString(Math.abs(c % 10)));
        }
    }

    public static String convertNumberToString(int number) {

        String numberCorekt = switch (Math.abs(number)) {
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
            case 11 -> "одинадцить";
            case 12 -> "двенадцать";
            case 13 -> "тренадцать";
            case 14 -> "четырнадцать";
            case 15 -> "пятнадцать";
            case 16 -> "шестнадцать";
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
            case 90 -> "девяноста";
            case 100 -> "сто";
            case 0 -> "ноль";
            default -> null;
        };
        if (numberCorekt == null) {
            return null;
        } else if (number < 0) {
            return "минус " + numberCorekt;
        } else {
            return numberCorekt;
        }
    }
}
