package materials.lesson10.nogit;

public class RunnerTriangle {

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.aria());
    }
}
