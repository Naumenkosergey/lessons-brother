package naymchik.lesson11.furniture;

public class Chair extends Furniture{
    private int numberLegs;
    private double heightLegs;
    private boolean presenceBackrest;

    public Chair(String name, double size, double price, int numberLegs, double heightLegs, boolean presenceBackrest) {
        super(name, size, price);
        this.numberLegs = numberLegs;
        this.heightLegs = heightLegs;
        this.presenceBackrest = presenceBackrest;
    }  public Chair() {
         }

    public int getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(int numberLegs) {
        this.numberLegs = numberLegs;
    }

    public double getHeightLegs() {
        return heightLegs;
    }

    public void setHeightLegs(double heightLegs) {
        this.heightLegs = heightLegs;
    }

    public boolean isPresenceBackrest() {
        return presenceBackrest;
    }

    public void setPresenceBackrest(boolean presenceBackrest) {
        this.presenceBackrest = presenceBackrest;
    }

    public void chairPrint(){
        System.out.printf("Название стула %s: габариты - %.2f; цена - %.2f; количество ножек - %d; высота ножек - %.2f;" +
                " наличие спинки - %s \n", getName(), getSize(), getPrice(), numberLegs, heightLegs, presenceBackrest);
    }

}
