package naymchik.lesson4;

import java.util.Scanner;

/**
 * 3. Создать класс NumberDayLeapYear, в котором реализовать возможность ввести пользователю строковое значение и целое число
 * месяц, день, соответственно, программа должна считать данные и по данным вывести порядковый день данного года,
 * при этом учесть, что программа считает только ВИСОКОСНЫЙ год. в классе должен быть метод
 * public static int getNumberDay (int day, string month ) - можно использовать дальше.
 * УЧТИТЕ ПОЛЬЗОВАТЕЛЬ МОЖЕТ ВВЕСТИ МЕСЯЦ НЕТОЛЬКО МАЛЕньКИМи БУКВАМИ, поможет метод toLowerCase()
 */
public class NumberDayLeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String month = scan.next().toLowerCase();
        int day = scan.nextInt();
        System.out.println(getNumberDay(day, month));
    }

    public static int getNumberDay(int day, String month) {

        int m = switch (month) {
            case "январь" -> 0;
            case "февраль" -> 31;
            case "март" -> 31 + 29;
            case "апрель" -> 31 * 2 + 29;
            case "май" -> 31 * 2 + 30 + 29;
            case "июнь" -> 31 * 3 + 30 + 29;
            case "июль" -> 31 * 3 + 30 * 2 + 29;
            case "август" -> 31 * 4 + 30 * 2 + 29;
            case "сентябрь" -> 31 * 5 + 30 * 2 + 29;
            case "октябрь" -> 31 * 5 + 30 * 3 + 29;
            case "ноябрь" -> 31 * 6 + 30 * 3 + 29;
            case "декабрь" -> 31 * 6 + 30 * 4 + 29;
            default -> 0;
        };
        return m + day;
    }
}
