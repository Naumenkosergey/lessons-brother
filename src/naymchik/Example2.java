package naymchik;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение x");
        int x = scan.nextInt();
        System.out.println("Вы ввели значение х=" + x);
        System.out.println("(x^2-7x+10)/(x^2-8x+10)=" + ((Math.pow(x,2)-7*x+10)/(Math.pow(x,2)-8*x+10)));

    }


}
