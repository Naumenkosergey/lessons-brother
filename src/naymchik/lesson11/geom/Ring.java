package naymchik.lesson11.geom;

public class Ring extends Geom{

    private int radius;

    public Ring(int radius) {
        this.radius = radius;
    }    public Ring() {

    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем окружность с радиусом %s\n", radius);
    }
}
