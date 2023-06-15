package naymchik.lesson4;

import java.util.Scanner;

/**
 * 4. Создать класс NumberDayNoLeapYear, в котором реализовать возможность ввести пользователю строковое значение и целое число
 * месяц, день, соответственно, программа должна считать данные и по данным вывести порядковый день данного года,
 * при этом учесть что программа считает только НЕВИСОКОСНЫЙ год. в классе должен быть метод
 * public static int getNumberDay (int day, string month ) - можно использовать дальше
 * УЧТИТЕ ПОЛЬЗОВАТЕЛЬ МОЖЕТ ВВЕСТИ МЕСЯЦ НЕТОЛЬКО МАЛЕньКИМи БУКВАМИ, поможет метод toLowerCase()
 */
public class NumberDayNoLeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next().toLowerCase();
        int day = scan.nextInt();
        System.out.println(getNumberDay(day, month));

    }

    public static int getNumberDay(int day, String month) {
        int m = switch (month) {
            case "февраль" -> 31;
            case "март" -> 31 + 28;
            case "апрель" -> 31 * 2 + 28;
            case "май" -> 31 * 2 + 30 + 28;
            case "июнь" -> 31 * 3 + 30 + 28;
            case "июль" -> 31 * 3 + 30 * 2 + 28;
            case "август" -> 31 * 4 + 30 * 2 + 28;
            case "сентябрь" -> 31 * 5 + 30 * 2 + 28;
            case "октябрь" -> 31 * 5 + 30 * 3 + 28;
            case "ноябрь" -> 31 * 6 + 30 * 3 + 28;
            case "декабрь" -> 31 * 6 + 30 * 4 + 28;
            default -> 0;

        };
        return day + m;
    }
}
