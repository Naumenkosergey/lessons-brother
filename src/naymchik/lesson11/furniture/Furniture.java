package naymchik.lesson11.furniture;

public class Furniture {

    private String name;
    private double size;
    private double price;

    public Furniture(String name, double size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
    public Furniture() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
