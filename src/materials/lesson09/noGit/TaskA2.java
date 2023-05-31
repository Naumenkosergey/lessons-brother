package materials.lesson09.noGit;

import materials.lesson09.Poem;

import java.util.*;
import java.util.stream.Stream;

public class TaskA2 {
    public static void main(String[] args) {
//        useMap();
        String[] split = Poem.text.split("[\\p{Punct}\\s]+");
        String[] arrWords = new String[0];
        int[] countWord = new int[0];
        int index = 0;
        for (String s : split) {
            String key = s;
            if (!checkArrWord(arrWords, key)) {
                arrWords = copyOldArrStr(arrWords);
                countWord = copyOldArrInt(countWord);
                int count = countKeys(split, key);
                arrWords[index] = key;
                countWord[index] = count;
                index++;
            }
        }
        for (int i = 0; i < arrWords.length; i++) {
            System.out.println(arrWords[i] + "=" + countWord[i]);
        }
    }

    private static int countKeys(String[] split, String key) {
        int count = 0;
        for (String s1 : split) {
            if (s1.equals(key))
                count++;
        }
        return count;
    }

    private static int[] copyOldArrInt(int[] countWord) {
        int[] arr = new int[countWord.length + 1];
        for (int i = 0; i < countWord.length; i++) {
            arr[i] = countWord[i];
        }
        return arr;
    }

    private static String[] copyOldArrStr(String[] arrWords) {
        String[] arr = new String[arrWords.length + 1];
        for (int i = 0; i < arrWords.length; i++) {
            arr[i] = arrWords[i];
        }
        return arr;
    }

    private static boolean checkArrWord(String[] arr, String word) {
        for (String s : arr) {
            if (word.equals(s))
                return true;
        }
        return false;
    }

    private static void useMap() {
        Map<String, Integer> map = new HashMap<>();
        Poem.text
                .lines()
                .flatMap(l -> Stream.of(l.split("[\\p{Punct}\\s]+")))
                .forEach(w -> {
                    if (map.containsKey(w)) {
                        map.put(w, map.get(w) + 1);
                    } else {
                        map.put(w, 1);
                    }
                });

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + "=" + pair.getValue());
        }
    }
}
