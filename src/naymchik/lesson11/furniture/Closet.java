package naymchik.lesson11.furniture;

public class Closet extends Furniture{
    private String materialHandle;
    private int numberSashes;
    private int numberBoxes;

    public Closet(String name, double size, double price, String materialHandle, int numberSashes, int numberBoxes) {
        super(name, size, price);
        this.materialHandle = materialHandle;
        this.numberSashes = numberSashes;
        this.numberBoxes = numberBoxes;
    }

    public Closet() {
    }

    public String getMaterialHandle() {
        return materialHandle;
    }

    public void setMaterialHandle(String materialHandle) {
        this.materialHandle = materialHandle;
    }

    public int getNumberSashes() {
        return numberSashes;
    }

    public void setNumberSashes(int numberSashes) {
        this.numberSashes = numberSashes;
    }

    public int getNumberBoxes() {
        return numberBoxes;
    }

    public void setNumberBoxes(int numberBoxes) {
        this.numberBoxes = numberBoxes;
    }
    public void closetPrint(){
        System.out.printf("Название шкафа %s: габариты - %.2f; цена - %.2f; материал ручек - %s; число створок - %d;" +
                " число ящиков - %d \n", getName(), getSize(), getPrice(), materialHandle, numberSashes, numberBoxes);
    }

}
