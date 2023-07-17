package naymchik.lesson2;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double c = scan.nextDouble();
        System.out.printf("Площадь круга:  %.3f. Длина окружности: %.1f", (double) ((Math.PI) * (Math.pow(c / ((Math.PI) * 2), 2))), c);
    }
}
