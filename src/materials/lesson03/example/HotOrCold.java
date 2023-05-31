package materials.lesson03.example;

import java.util.Scanner;

public class HotOrCold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp < -20 || temp > 40)
            System.out.println("невыносимо");
        else
            System.out.println("терпимо");
    }
}
