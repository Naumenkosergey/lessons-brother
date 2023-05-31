package materials.lesson11;

public abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;

    public abstract void gas();
    public abstract void brake();

    //теггеры и сеттеры


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}


