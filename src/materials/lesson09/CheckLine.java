package materials.lesson09;

//import java.util.Locale;
import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println(checkLine(line, word));
    }

    private static Boolean checkLine(String line, String word) {
        return line.toLowerCase().startsWith(word.toLowerCase())&& line.toLowerCase().endsWith(word.toLowerCase());

    }
}
