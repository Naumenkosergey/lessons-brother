package materials.lesson09.noGit;

import materials.lesson09.Poem;

public class TaskB2 {

    public static void main(String[] args) {
        String[] split = Poem.text.split("[.?]+");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replaceAll("\\p{Punct}", " ").trim();
            split[i] = split[i].replaceAll("\\s+", " ").trim();
        }
        sort(split);
        print(split);
    }

    private static void print(String[] arr) {
        for (String items : arr) {
            System.out.println(items);
        }
    }

    private static void sort(String[] mas) {
        boolean swap;
        do {
            swap = false;
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j].length() > mas[j + 1].length()) {
                    swap = true;
                    String s = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = s;
                }
            }
        } while (swap);
    }
}
