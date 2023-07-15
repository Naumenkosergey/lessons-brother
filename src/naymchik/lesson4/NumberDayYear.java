package naymchik.lesson4;

import java.util.Scanner;

/**
 * 6.Создать класс NumberDayYear, в котором реализовать возможность ввести пользователю  целое число, строку и целое число:
 * число, месяц, год, соответственно программа должна считать данные и по данным вывести порядковый день данного года,
 * при этом учесть високосный год, также учесть что пользователь может ввести отрицательные числа, перевести их в
 * положительные. Если пользователь введет имя не существующего месяца, то ошибка! обязателный метод
 * private static boolean checkMonth(String month)
 */
public class NumberDayYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int day = Math.abs(scan.nextInt());
        String month = scan.next().toLowerCase();
        int year = Math.abs(scan.nextInt());
        LeapYearWithMethod.leapYear(year);

        if (!checkMonth(month)) {
            System.out.println("Ошибка");
        } else {
            System.out.println(LeapYearWithMethod.leapYear(year).equals("Високосный")
                    ? NumberDayLeapYear.getNumberDay(day, month)
                    : NumberDayNoLeapYear.getNumberDay(day, month));
        }
    }

    private static boolean checkMonth(String month) {
        return switch (month) {
            case "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь" ->
                    true;
            default -> false;
        };
    }
}
