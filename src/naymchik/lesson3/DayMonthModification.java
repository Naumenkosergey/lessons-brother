package naymchik.lesson3;

import java.util.Scanner;

/**
 * 7. Создать класс DayMonthModification, в котором реализовать возможность задачи 6. Мсяц может быть больше  12.
 * День может быть больше 7, если 8 - понедельник, 9-вторник, 10-среда и так далее.  Программа выводит сообщение
 * месяц - день. неправильное значение может появится если что-то отрицательное.
 * Пример: ввод: 2 26
 * вывод: февраль - пятница
 * Пример: ввод: 4 651
 * вывод: апрель - воскресенье
 */


public class DayMonthModification {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        short month = scan.nextShort();
        short day = scan.nextShort();

//        short month = 15;
//        short day = -9;



        String d;
        d = switch (day % 7) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 0 -> "воскресенье";
            default -> null;
        };

        String m;
        m = switch (month % 12) {
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
            case 0 -> "Декабрь";
            default -> null;
        };

        if (d == null && m == null) {
            System.out.printf("%s\n", "Неправильное значение месяца и дня");
        } else if (d == null) {
            System.out.printf("%s\n", "Неправильное значение дня");
        } else if (m == null) {
            System.out.printf("%s\n", "Неправильное значение месяца");
        } else {
            System.out.printf("%s - %s\n", m, d);
        }


    }
}
