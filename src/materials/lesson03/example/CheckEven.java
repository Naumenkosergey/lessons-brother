package materials.lesson03.example;

import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 != 0)
        {
            System.out.println("нечетное");
        }
        else {
            System.out.println("четное");
        }
    }
}
