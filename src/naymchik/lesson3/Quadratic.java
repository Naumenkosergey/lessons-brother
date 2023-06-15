package naymchik.lesson3;

import java.util.Scanner;

/**
 * 8. Создать класс Quadratic, в котором реализовать возможность вводить три целых числа: a, b и c.
 * Найти корни квадратного уравнения вида, ax^2+bx+c=0, при этом учесть что дискриминант может быть не только
 * положительным, но и отрицательным, в этом случае выдать сообщение "Уравнение не имеет корней".
 */
public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();

        double dec = Math.pow(b, 2) - 4 * a * c;
        if (dec < 0) {
            System.out.printf("%s\n", "Уравнение не имеет корней");
        } else {
            double x1 = (-b + Math.pow(dec, 0.5)) / (2 * a);
            double x2 = (-b - Math.pow(dec, 0.5)) / (2 * a);
            System.out.printf("x1=%.2f; x2=%.2f", x1, x2);

        }


    }
}
