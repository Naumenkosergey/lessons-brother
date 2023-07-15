package naymchik.lesson2;

import java.util.Scanner;

public class PerimeterSquareTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение катета 1");
        int x = scan.nextInt();
        System.out.println("Введите значение катета 2");
        int y = scan.nextInt();
        double z = Math.pow((x * x + y * y), 0.5);
        System.out.printf("Площадь прямоугольного треугольника со сторонами %d, %d: %.3f.\n", x, y, 0.5 * x * y);
        System.out.printf("Периметр: %.3f", (x + y + z));
    }
}
