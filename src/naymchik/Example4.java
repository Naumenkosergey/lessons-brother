package naymchik;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение х");
        int x = scan.nextInt();
        System.out.println("Вы ввели значение х=" + x);
        System.out.println("Введите значение y");
        int y = scan.nextInt();
        System.out.println("Вы ввели значение y=" + y);

        System.out.println((x-Math.pow(10,Math.sin(x))+Math.cos(x-y)));
    }
}
