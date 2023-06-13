package naymchik.lesson2;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите длину окружности");
        double c = scan.nextDouble();
        // Радиус равен С/2*П
//        double r = c/((Math.PI)*2);
//        System.out.printf("Площадь круга: %.3f. Длина окружности: %.1f \n", (double)((Math.PI) * (Math.pow(c / ((Math.PI) * 2), 2))), c);
        System.out.printf("Площадь круга:  %.3f. Длина окружности: %.1f", (double)((Math.PI) * (Math.pow(c / ((Math.PI) * 2), 2))), c);

    }
}
