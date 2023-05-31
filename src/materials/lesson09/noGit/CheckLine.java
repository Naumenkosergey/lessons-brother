package materials.lesson09.noGit;


import java.util.Scanner;

/**
 *     Создать класс CheckLine.
 *     Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
 *     если строка начинается и заканчивается этим словом.*/
public class CheckLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine() ;
//        String line = "Приветменя зовут сергейПривет";
        String word = scanner.nextLine();
//        String word = "привет";
        System.out.println(сheckLine(line, word));
    }

    static boolean сheckLine(String line, String word) {
        return line.startsWith(word) && line.endsWith (word);

//        String[] split = line.split(" ");
//        return (split[0].equalsIgnoreCase(word) && split[split.length - 1].equalsIgnoreCase(word));

    }

}
