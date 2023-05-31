package materials.lesson11;

public class Hatchback extends Car {

    public Hatchback(String model, String color, int speed) {
        setModel(model);
        setColor(color);
        setMaxSpeed(speed);
    }

    @Override
    public void gas() {
        System.out.println("Хэтчбек газует");
    }

    @Override
    public void brake() {
        System.out.println("Хэтчбек тормозит");
    }

    @Override
    public String toString() {
        return String.format("Хэтчбек модель: %s,цвет: %s, скорость:%d",
                getModel(), getColor(), getMaxSpeed());
    }
}
