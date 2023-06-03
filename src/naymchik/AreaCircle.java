package naymchik;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину окружности");
        double c = scan.nextDouble();
        // Радиус равен С/2*П
//        double r = c/((Math.PI)*2);
        System.out.println("Площадь круга: " + ((Math.PI)*(Math.pow(c/((Math.PI)*2),2))) + ". Длина окружности: " + c);

    }
}
