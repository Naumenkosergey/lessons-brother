package naymchik;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение х");
        int x = scan.nextInt();
        System.out.println("Вы ввели значение х=" + x);
        System.out.println("Введите значение y");
        int y = scan.nextInt();
        System.out.println("Вы ввели значение y=" + y);
        System.out.println("3^(-x)-cosx+sin(2xy)=" + (Math.pow(3,-(x))-Math.cos(x)+Math.sin(2*x*y)));
    }
}
