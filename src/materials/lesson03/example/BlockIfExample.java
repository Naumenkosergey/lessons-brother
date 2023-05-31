package materials.lesson03.example;

import java.util.Scanner;

public class BlockIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (!(a > 10)) {
            System.out.println("число больше 10");
        } else if (!(a < 10)) {
            System.out.println("число меньше 10");
        } else {
            System.out.println("число равно 10");
        }
        System.out.println("правильно?");
    }
}
