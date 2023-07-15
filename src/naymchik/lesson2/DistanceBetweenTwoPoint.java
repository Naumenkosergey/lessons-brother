package naymchik.lesson2;

import java.util.Scanner;

public class DistanceBetweenTwoPoint {
               public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.printf("Расстояние между точками A(%d, %d) и B(%d, %d): %.3f", x1, y1, x2, y2, (Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)))));

    }
}
