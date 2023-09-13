package naymchik.lesson10;

import naymchik.lesson8.Point;
import naymchik.lesson8.Rectangle;

/**
 * Задание
 * Описать класс Triangle, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
 * периметра. Описать свойства для получения состояния объекта.
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }



    public void returnSquare(Point A, Point B, Point C){
        double AB = A.distance(B);
        Rectangle.chekRectangle(A, B, C);

    }

    public static void main(String[] args) {
        Point a = new Point(10, 20);
        Point b = new Point(0, 20);
        Point c = new Point(-10, 20);
        Triangle ABC = new Triangle(a, b, c);
        Point d = new Point(12,54);


    }
}
