package materials.lesson09.noGit;

import materials.lesson09.Poem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC1 {
    public static void main(String[] args) {
        String[] split = Poem.text.split("\n");
        int maxLength = findMaxLength(split);
        StringBuilder allText = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            StringBuilder sb = new StringBuilder(split[i]);
            int space = 1;
            while (sb.length() < maxLength) {
                Pattern pattern = Pattern.compile("[а-яА-ЯёЁ:,-]+\\s" + "{" + space + "}");
                Matcher matcher = pattern.matcher(sb);
                while (matcher.find()){
                    if (sb.length() >= maxLength){
                        break;
                    }
                    int position = matcher.end();
                    sb.insert(position," ");
                }
                space++;
            }
            allText.append(sb).append("\n");
        }
        System.out.println(allText);
    }

    private static int findMaxLength(String[] split) {
        int max = split[0].length();
        for (int i = 1; i < split.length; i++) {
            if (split[i].length() > max) {
                max = split[i].length();
            }
        }
        return max;
    }
}
