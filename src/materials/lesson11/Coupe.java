package materials.lesson11;

public class Coupe extends Car {

    public Coupe(String model, String color, int speed) {
        setModel(model);
        setColor(color);
        setMaxSpeed(speed);
    }

    @Override
    public void gas() {
        System.out.println("Купе газует");
    }

    @Override
    public void brake() {
        System.out.println("Купе тормозит");
    }

    @Override
    public String toString() {
        return String.format("Купе модель: %s,цвет: %s, скорость:%d",
                getModel(), getColor(), getMaxSpeed());
    }
}
