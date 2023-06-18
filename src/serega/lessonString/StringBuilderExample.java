package serega.lessonString;

import java.util.Date;

public class StringBuilderExample {

    public static void main(String[] args) {
        crateStringForStringBuilder(150);
        crateStringForConcat(150);
        System.out.println(checkPalindrom("а роза  упалаа  ё  на лап     у азора"));
    }

    private static void crateStringForStringBuilder(int count) {
        System.out.println("StringBuilder");
        StringBuilder result = new StringBuilder();
        long start = new Date().getTime();
        for (int i = 0; i < count; i++) {
            result.append(i);
        }
        long end = new Date().getTime();
        System.out.println((end - start) / 1000);
        System.out.println(result.length());
        result.replace(45, 89, "hello").append("KONEC")
                .insert(0,"nachalo").reverse();
        System.out.println(result);
    }

    private static void crateStringForConcat(int count) {
        System.out.println("StringConcat");
        String result = "";
        long start = new Date().getTime();
        for (int i = 0; i < count; i++) {
            result += i;
        }
        long end = new Date().getTime();
        System.out.println((end - start) / 1000);
        System.out.println(result.length());
    }

    static boolean checkPalindrom(String line){
        String lineWisoutSpases = line.replaceAll("[A-Za-z_]{6,}@[A-Za-z_]{4,}\\.[A-Za-z_]{2,4}", " ");
//        String lineWisoutSpases = line.replaceAll("\\p{Punct}", " ");
        System.out.println(lineWisoutSpases);
        String lineReverse = new StringBuilder(lineWisoutSpases).reverse().toString();
        System.out.println("\"HELLO\"");
        return lineReverse.equalsIgnoreCase(lineWisoutSpases);

    }


}
