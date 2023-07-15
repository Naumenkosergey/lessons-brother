package naymchik.lesson9;

import java.util.Date;

public class EqualsSpeed {

    public static void main(String[] args) {
        long start = new Date().getTime();
        String s2 = createStringStringBuilder();
        long current = new Date().getTime();
        System.out.println("Время на создание строки через SB: " + (current - start) + " ms");
        start = new Date().getTime();
        String s1 = createStringConcat();
        current = new Date().getTime();
        System.out.println("Время на создание строки через конкатенацию: " + (current - start) + " ms");
    }

    static public String createStringConcat() {
        String line = "";
        for (int i = 0; i < 100000; i++) {
            line += i;
        }
        return line;
    }

    static public String createStringStringBuilder() {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            line.append(i);
        }
        return line.toString();
    }
}
