package naymchik;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сторону равностороннего треугольника: ");
        double a = scan.nextDouble();
        System.out.println("Треугольник со стороной " + a + " имеет:");
        System.out.println("Высоту " + (a*0.5*Math.pow(3,0.5)));
        System.out.println("площадь " + (0.25*Math.pow(3, 0.5)*a*a));
        System.out.println("радиус вписанной окружности " + (a/(2*Math.pow(3, 0.5))));
        System.out.println("радиус описанной окружности " + (a/Math.pow(3, 0.5)));
    }
}
