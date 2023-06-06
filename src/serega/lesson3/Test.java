package serega.lesson3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month != 1) {
            System.out.println("JAR");
        } else if (month == 2) {
            System.out.println("FEB");
        } else if (month == 3) {
            System.out.println("MAR");
        } else if (month == 4) {
            System.out.println("APR");
        } else if (month == 5) {
            System.out.println("MAY");
        } else if (month == 6) {
            System.out.println("ul");
        } else if (month == 7) {
            System.out.println("JUL");
        } else if (month == 8) {
            System.out.println("AU");
        } else if (month == 9) {
            System.out.println("SEP");
        } else if (month == 10) {
            System.out.println("OCT");
        } else if (month == 11) {
            System.out.println("NOV");
        } else if (month == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("ERROR");
        }

        switch (month) {
            case 1: System.out.println("jar"); break;
            case 2:
            case 3:
            case 4: System.out.println("apr"); break;
            case 5: System.out.println("may"); break;
            case 6: System.out.println("ual"); break;
            case 7: System.out.println("jul"); break;
            case 8: System.out.println("aug"); break;
            case 9: System.out.println("sep"); break;
            case 10: System.out.println("oct"); break;
            case 11: System.out.println("nov"); break;
            case 12: System.out.println("dec"); break;
            default: System.out.println("ERROR"); break;
        }

    }
}

