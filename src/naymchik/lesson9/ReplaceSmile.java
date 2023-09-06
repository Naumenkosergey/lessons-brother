package naymchik.lesson9;

import java.util.Scanner;

/**
 * Задание 1
 * Создать класс ReplaceSmile.
 * Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class ReplaceSmile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stroka = Poem.text;
        System.out.println(stroka.replace(":(", ":)"));
    }
}
