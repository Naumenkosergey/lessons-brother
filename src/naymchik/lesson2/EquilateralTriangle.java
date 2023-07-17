package naymchik.lesson2;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.printf("Треугольник со стороной %.3f имеет:\n", a);
        System.out.printf(" Высоту %.3f\n", (a * 0.5 * Math.pow(3, 0.5)));
        System.out.printf(" площадь %.3f\n", (0.25 * Math.pow(3, 0.5) * a * a));
        System.out.printf(" радиус вписанной окружности %.3f\n", (a / (2 * Math.pow(3, 0.5))));
        System.out.printf("радиус описанной окружности %.3f\n", (a / Math.pow(3, 0.5)));
    }
}
