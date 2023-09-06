package naymchik.lesson8;

/**
 * Прямоугольник
 * Используя класс точки, создать класс Rectangle, описывающий прямоугольник. В нём хранятся два поля типа
 * Point - координаты левого верхнего и правого нижнего углов. Создать следующие методы в классе Rectangle:
 * - Высчитывающий площадь прямоугольника
 * - Высчитывающий длину диагонали
 */
public class Rectangle {


    public static void chekRectangle(Point a, Point b, Point c) {

        double AB = a.distance(b);
        double CB = b.distance(c);
        double CA = a.distance(c);
        if (AB + CB > CA && AB + CA > CB && AB < CB + CA) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }

    public static void returnSquare(Point a, Point b, Point c) {
        double AB = a.distance(b);
        double CB = b.distance(c);
        double CA = a.distance(c);
        double perimeter = AB + CB + CA;
        double square = 0;
        if (AB + CB > CA && AB + CA > CB && AB < CB + CA) {
            square = Math.sqrt(perimeter * 0.5 * (perimeter * 0.5 - AB) * (perimeter * 0.5 - CB) * (perimeter * 0.5 - CA));
        }
        System.out.println("Площадь треугольника S=" + square);

    }

    public static void determineRadius(Point a, Point b, Point c) {
        double AB = a.distance(b);
        double CB = b.distance(c);
        double CA = a.distance(c);
        double perimeter = AB + CB + CA;
        double square = Math.sqrt(perimeter * 0.5 * (perimeter * 0.5 - AB) * (perimeter * 0.5 - CB) * (perimeter * 0.5 - CA));
        if (AB + CB > CA && AB + CA > CB && AB < CB + CA) {
            double r = 2 * square / perimeter;
            System.out.println("Радиус вписанной окружности r=" + r);
            double R = AB * CA * CB / (4 * square);
            System.out.println("Радиус описанной окружности R=" + R);
        }
    }

    public static void main(String[] args) {
        Point tochkaA = new Point(10, 0);
        Point tochkaB = new Point(0, 3);
        Point tochkaC = new Point(4, 0);

        chekRectangle(tochkaA, tochkaB, tochkaC);
        returnSquare(tochkaA, tochkaB, tochkaC);
        determineRadius(tochkaA, tochkaB, tochkaC);
    }


}
