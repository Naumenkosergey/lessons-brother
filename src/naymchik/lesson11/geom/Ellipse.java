package naymchik.lesson11.geom;

public class Ellipse extends Geom{
    private int radius1;
    private int radius2;

    public Ellipse(int radius1, int radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }    public Ellipse() {

    }

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем элипс с радиусами %s и %s\n", radius1, radius2);
    }
}
