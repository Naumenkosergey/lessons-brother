package naymchik.lesson11.furniture;

public class Table extends Furniture {
    public int numberLegs;
    public double squareTable;

    public Table(String name, double size, double price, int numberLegs, double squareTable) {
        super(name, size, price);
        this.numberLegs = numberLegs;
        this.squareTable = squareTable;
    }

    public Table() {
    }
    public void tablePrint(){
        System.out.printf("Название стола %s: габариты - %.2f; цена - %.2f; количество ножек - %d; " +
                "площадь столешницы - %.2f;\n", getName(), getSize(), getPrice(), numberLegs, squareTable);
    }
}
