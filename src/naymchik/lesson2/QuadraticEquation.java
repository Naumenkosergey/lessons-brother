package naymchik.lesson2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите значение a ");
        int a = scan.nextInt();
//        System.out.print("Введите значение b ");
        int b = scan.nextInt();
//        System.out.print("Введите значение c ");
        int c = scan.nextInt();
        double d = b * b - 4 * a * c;
        double x1 = (-b + (Math.pow(d, 0.5))) / (2 * a);
        double x2 = (-b - (Math.pow(d, 0.5))) / (2 * a);
        System.out.printf("Уравнение %dx^2+%dx+%d имеет корни x1=%.2f x2=%.2f", a, b, c, x1, x2);
    }


}
