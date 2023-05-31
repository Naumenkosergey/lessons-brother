package materials.lesson09.noGit;

import materials.lesson09.Poem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        String text = Poem.text;
        String[] splitText = text.split("[\\s\\p{Punct}]+");
        Pattern pattern = Pattern.compile("^[^аеёиуоыюэяАЕЁИУОЫЮЭЯ][а-яёЁ]+[аеёиуоыюэя]$");
        for (String word : splitText) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word);
            }
        }
    }
}
