package naymchik.lesson3;

import java.util.Scanner;

/**
 * 14. Создать класс Price, в котором реализовать ввод ввод дробного числа, вывести на экран цену товара в соответствии с
 * вводимым значением, по правилам языка.
 * Пример ввод: 5,26
 * вывод: 5 рублей 26 копеек
 * Пример ввод: 1,02
 * вывод: 1 рубль 2 копейки
 * Пример ввод: 23,01
 * вывод: 23 рубля  1
 */
public class Price {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double tsena = scan.nextDouble();
        int tsenaRubli = (int) tsena;
        int tsenaKopejki = (int) (Math.round(tsena * 100)) % 100;

        String rub;
        if (sklonenie((int) tsena % 100) == 3) {
            if (sklonenie(((int) tsena % 100) % 10) == 3) {
                rub = "Ошибка";
            } else if (sklonenie(((int) tsena % 100) % 10) == 2) {
                rub = "рублей";
            } else if (sklonenie(((int) tsena % 100) % 10) == 1) {
                rub = "рубля";
            } else if (sklonenie(((int) tsena % 100) % 10) == 0) {
                rub = "рубль";
            } else {
                rub = "Ошибка";
            }
        } else if (sklonenie((int) tsena % 100) == 2) {
            rub = "рублей";
        } else if (sklonenie((int) tsena % 100) == 1) {
            rub = "рубля";
        } else if (sklonenie((int) tsena % 100) == 0) {
            rub = "рубль";
        } else {
            rub = "Ошибка";
        }

        String kop;
        if (sklonenie(tsenaKopejki) == 3) {
            byte x1 = sklonenie(tsenaKopejki % 10);
            if (x1 == 3) {
                kop = "Ошибка";
            } else if (x1 == 2) {
                kop = "копеек";
            } else if (x1 == 1) {
                kop = "копейки";
            } else {
                kop = "копейка";
            }
        } else if (sklonenie(tsenaKopejki) == 2) {
            kop = "копеек";
        } else if (sklonenie(tsenaKopejki) == 1) {
            kop = "копейки";
        } else if (sklonenie(tsenaKopejki) == 0) {
            kop = "копейка";
        } else {
            kop = "Ошибка";
        }
        System.out.printf("%2s %s %2s %s", tsenaRubli, rub, tsenaKopejki, kop);
    }

    private static byte sklonenie(int a) {
        byte variant;
        variant = switch (a) {
            case 1 -> 0;
            case 2, 3, 4 -> 1;
            case 5, 6, 7, 8, 9, 0, 11, 12, 13, 14 -> 2;
            default -> 3;
        };
        return variant;
    }
}
