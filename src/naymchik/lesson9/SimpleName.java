package naymchik.lesson9;

import java.util.Locale;
import java.util.Scanner;

/**
 * Задание 3.
 * Создать класс SimpleName.
 * Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
 * в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре,
 * а результирующая строка должна быть в верхнем.
 */
public class SimpleName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        returnFIO(line);

    }

    private static void returnFIO(String str) {
        String[] words = str.split(" ");
        System.out.printf("%s.%s.%s.", words[0].toUpperCase(Locale.ROOT).charAt(0),
                words[1].toUpperCase(Locale.ROOT).charAt(0), words[2].toUpperCase(Locale.ROOT).charAt(0));
    }


}
