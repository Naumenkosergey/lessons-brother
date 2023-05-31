package materials.lesson10.nogit;

/**
 * Задание
 Описать класс Triangle, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
 периметра. Описать свойства для получения состояния объекта.*/
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

    public double perimeter() {
        return a.distance(b) + b.distance(c) + a.distance(c);
    }

    public double aria() {
        double p = this.perimeter() / 2;
        return Math.sqrt((p - a.distance(b) * (p - b.distance(c)) * (p - a.distance(c))));
    }
}
