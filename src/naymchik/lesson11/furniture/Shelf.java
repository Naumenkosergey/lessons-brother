package naymchik.lesson11.furniture;

public class Shelf extends Furniture {
    private int numberBox;
    private double sizeBox;

    public Shelf(String name, double size, double price, int numberBox, double sizeBox) {
        super(name, size, price);
        this.numberBox = numberBox;
        this.sizeBox = sizeBox;
    }  public Shelf() {
    }

    public int getNumberBox() {
        return numberBox;
    }

    public void setNumberBox(int numberBox) {
        this.numberBox = numberBox;
    }

    public double getSizeBox() {
        return sizeBox;
    }

    public void setSizeBox(double sizeBox) {
        this.sizeBox = sizeBox;
    }
    public void shelfPrint(){
        System.out.printf("Название полок %s: габариты - %.2f; цена - %.2f; число ящиков - %d; " +
                "площадь ящика - %.2f;\n", getName(), getSize(), getPrice(), numberBox, sizeBox);
    }



}
