package naymchik.lesson3;

import java.util.Scanner;

/**
 * 13. Создать класс AgeHuman, в котором реализовать ввод строки name и целого числа (byte) age программа должна вывести
 * возраст человека в соответствии нормам русского зыка.
 * Пример ввод: Sergey: 28
 * вывод: Sergey 28 лет
 * Пример ввод: Petr 33
 * вывод: Petr 33 года
 * Пример ввод: Kira
 * вывод: kira 1 год
 */
public class AgeHuman {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        byte year = scan.nextByte();

//        String name = "Юрий";
//        int year = 73;


//        int year;
//        if (year1 > 99) {
//            year = year1 - 100;
//        } else {
//           year = year1;
//        }

        if (year > 4 && year < 21 || year % 10 > 4 && year % 10 < 10 || year % 10 == 0) {
            System.out.printf("%s %d %s", name, year, "лет");
        } else if (year % 10 == 1) {
            System.out.printf("%s %s %s", name, year, "год");
        } else if (year % 10 > 1 && year % 10 <= 4) {
            System.out.printf("%s %s %s", name, year, "года");
        } else {
            System.err.println("ошибка");
        }


    }


}
