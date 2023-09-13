package naymchik.lesson11.geom;

public class Line extends Geom{
    private int length;

    public Line(int length) {
        this.length = length;
    }  public Line() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
    System.out.printf("Рисуем линию длина - %s\n", length);
    }

}
