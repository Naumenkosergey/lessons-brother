package naymchik.lesson10.Room;

/**
 * количества окон класс Window (ширина, высота)
 */
public class Window {
    private double width;
    private double height;

    public Window(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Window() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double squareWindow(){
        return this.height*this.width;
    }
}
