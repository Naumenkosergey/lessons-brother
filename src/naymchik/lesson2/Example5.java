package naymchik.lesson2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение х");
        int x = scan.nextInt();
        System.out.println("Вы ввели значение х=" + x);


        System.out.println("x-10sinx+|x^4-X^5|=" + (x-10*Math.sin(x)+Math.abs(Math.pow(x,4)-Math.pow(x,5))));
        System.out.println("x-10sinx+|x^4-X^5|=" + (x-10*Math.sin(x)+Math.pow(x,4)*Math.abs(1-x)));
    }
}
