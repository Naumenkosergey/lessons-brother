package naymchik.lesson9;
/**
 * Создать класс CheckLine.
 * Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
 * если строка начинается и заканчивается этим словом. Регистр неважен
 */


//import java.util.Locale;

import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stroka = scan.nextLine();
        String slovo = scan.nextLine();
        System.out.println(checkStroku(stroka, slovo));

    }

    private static boolean checkStroku(String str, String str1) {
        return str.toLowerCase().startsWith(str1.toLowerCase()) && str.toLowerCase().endsWith(str1.toLowerCase());
    }

}
