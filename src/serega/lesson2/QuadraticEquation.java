package serega.lesson2;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение a ");
        int a = scan.nextInt();
        System.out.print("Введите значение b ");
        int b = scan.nextInt();
        System.out.print("Введите значение c ");
        int c = scan.nextInt();
        double D = b * b - 4 * a * c;
        double x1 = (-b - (Math.pow(D, 0.5))) / (2 * a);
        double x2 = (-b + (Math.pow(D, 0.5))) / (2 * a);

        System.out.printf("Уравнение %d^2+%d+%d имеет корни x1=%.2f x2=%.2f%n", a, b, c, x1, x2);
        System.out.printf(Locale.ENGLISH, "Уравнение %d^2+%d+%d имеет корни x1=%.2f x2=%.2f%n", a, b, c, x1, x2);
        System.out.printf(Locale.getDefault(), "Уравнение %d^2+%d+%d имеет корни x1=%5$.2f x2=%4$.2f%n", a, b, c, x1, x2);
    }


}
