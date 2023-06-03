package naymchik;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение a ");
        double a = scan.nextDouble();
        System.out.print("Введите значение b ");
        double b = scan.nextDouble();
        System.out.print("Введите значение c ");
        double c = scan.nextDouble();
        double D = b*b-4*a*c;
        double x1 = (-b - (Math.pow(D, 0.5)))/(2*a);
        double x2 = (-b + (Math.pow(D, 0.5)))/(2*a);
        System.out.println("Уравнение " + a + "x^2+" + b + "x+" + c + "имеет корни x1=" + x1 + "x2=" + x2);
    }


}
