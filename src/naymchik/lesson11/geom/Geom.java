package naymchik.lesson11.geom;

public abstract class Geom {
    private String width;
    private String color;

    public void draw() {

    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
