package materials.lesson03.example;

import java.util.Scanner;

public class TemperatureBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp > 10 && temp <= 40)
            System.out.println("Идем на улицу");
        else if (temp < 10 && temp > -10)
            System.out.println("Сидим дома");
        else if (temp < -20)
            System.out.println("Идем в баню, греться");
        else
            System.out.println("Действие не определено");
    }
}
