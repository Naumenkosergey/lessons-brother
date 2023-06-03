package naymchik;

import java.util.Scanner;

public class PerimeterSquareTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение катета 1");
        int x = scan.nextInt();
//        System.out.println("Длина катета 1 = " + x);
        System.out.println("Введите значение катета 2");
        int y = scan.nextInt();
//        System.out.println("Длина катета 2 = " + y);
        double z = Math.pow((x * x + y * y), 0.5);
//        System.out.println("Длина гипатинузы  = " + z);

        System.out.printf("Площадь прямоугольного треугольника со сторонами %d, %d: %.3f.\n", x, y, 0.5 * x * y);
        System.out.printf("Периметр: %.3f", (x + y + z));

    }

}
