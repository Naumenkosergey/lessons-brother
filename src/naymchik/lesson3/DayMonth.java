package naymchik.lesson3;

import java.util.Scanner;

/**
 * 6. Создать класс DayMonth, в котором реализовать возможность вводить два целых положительных больше 0 числа month не
 * больше 12,   day не больше 7. Программа выводит сообщение месяц - день
 * Пример: ввод: 2 5
 * вывод: Февраль - пятница
 * Пример: ввод 13 5
 * вывод: Неправильное значение месяца
 * Пример: ввод: 3 9
 * вывод: Неправильное значение дня
 * Пример: ввод: 15 8
 * вывод: Неправильное значение месяца и дня
 */
//Ruturn null

public class DayMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte month = scan.nextByte();
        byte day = scan.nextByte();

        String p = switch (day) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> null;
        };


        String d = switch (month) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> null;
        };


        if (p == null && d == null) {
            System.out.printf("%s\n", "Неправильное значение месяца и дня");
        } else if (d == null) {
            System.out.printf("%s\n", "Неправильное значение месяца");
        } else if (p == null ) {
            System.out.printf("%s\n", "Неправильное значение дня");
        } else {
            System.out.printf("%s - %s\n", d, p);
        }

    }

}
