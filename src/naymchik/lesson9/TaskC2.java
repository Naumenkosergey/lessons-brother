package naymchik.lesson9;

import java.util.Date;

public class TaskC2 {

    public static void main(String[] args) {
        String text = randomGenerate(Poem.text);
        long time = new Date().getTime();
        String slowString = slow(text);
        System.out.println(slowString);
    }

    private static String randomGenerate(String text) {
        return "";
    }

    static String slow(String text){
        String s = "";
        for (int i = 0; i < 100000; i++) {

        }
        return s;
    }

   static String fast(String text){
        return null;
    }
}
