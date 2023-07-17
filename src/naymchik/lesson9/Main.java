package naymchik.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String s = "И там я был, и мёд я пил\n";
        StringBuilder sb = new StringBuilder(s);
        int space = 1;
        while (sb.length() < 36) {
            Pattern pattern = Pattern.compile("[а-яА-ЯёЁ:,-]+\\s" + "{" + space + "}");
            Matcher matcher = pattern.matcher(sb);
            while (matcher.find()) {
                if (sb.length() >= 36) {
                    break;
                }
                int position = matcher.end();
                sb.insert(position, " ");
            }
            space++;
        }
        System.out.println(sb);
    }
}
