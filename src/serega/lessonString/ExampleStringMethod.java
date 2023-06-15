package serega.lessonString;

import java.util.Locale;

public class ExampleStringMethod {

    public static void main(String[] args) {
        String s = " vfsddsdfsdfsdf +7(919)457-82-36 sdvsd dsfvsdv +7(919)457-82-36 d,bl;df, ";

        System.out.println(s);
        System.out.println(s.length());
//        s = s.trim();
        System.out.println(s);
        System.out.println(s.length());
//        System.out.println(s.charAt(5));
//        System.out.println(s.substring(5));
//        System.out.println(s.substring(5, 11));
        System.out.println(s.replace(" ", "  "));
        System.out.println(s.replace(" m", " д"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replaceFirst("m", "всё"));
        String[] s1 = s.toUpperCase().trim().split("M");
        for (String s2 : s1) {
            System.out.println(s2);
        }
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        System.out.println(s.contains(";"));
        System.out.println(s.contains("!"));
        System.out.println(s.contains("sdv"));
        System.out.println(s.concat("sdv"));
        System.out.println(s + "sdv");
        System.out.println(s.endsWith("sdv"));
        System.out.println(s.endsWith(", "));
        System.out.println(s.lastIndexOf("m"));
        System.out.println(s.lastIndexOf("d"));
        System.out.println(s.charAt(35));

    }
}
