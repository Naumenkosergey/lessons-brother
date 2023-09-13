package naymchik.lesson11.geom;

public class Rect extends Geom{

    private int length;
    private int height;

    public Rect(int length, int height) {
        this.length = length;
        this.height = height;
    }public Rect() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем прямую длина - %s, высота - %s\n", length, height);
    }

}
