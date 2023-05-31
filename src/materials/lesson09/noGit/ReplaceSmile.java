package materials.lesson09.noGit;

import java.util.Scanner;

public class ReplaceSmile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String newLine = line.replaceAll(":\\(", ":)");
        System.out.println(newLine);
    }
}
