package naymchik.lesson8;

import java.util.Scanner;

/**
 * Точка
 * Создать класс Point, описывающий точку в двумерных координатах. Полями этого класса должны быть координаты x и y.
 * Класс должен иметь один конструктор, принимающий координаты x и y.). Создать метод distance(Point, Point),
 * который возвращает расстояние между точками.
 */
public class Point {
    public int x;
    public int y;
    String name;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.name = "";
    }


    public double distance(Point other) {
        return Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Point tochkaA = Point.setValueUser(scan);
//        Point tochkaB = Point.setValueUser(scan);
//        Point tochkaC = new Point(10, 15);
//        System.out.println(tochkaA.distance(tochkaB));
//        System.out.println(tochkaA.distance(tochkaC));
        Point pointD = new Point();
        System.out.println(pointD.name.length());
    }

    public static Point setValueUser(Scanner scan) {
        System.out.println("Ведите координаты {x} точки");
        int x = scan.nextInt();
        System.out.println("Ведите координаты {y} точки");
        int y = scan.nextInt();
        return new Point(x, y);
    }

}
