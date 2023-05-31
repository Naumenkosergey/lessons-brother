package materials.lesson11;

public class Crossover extends Car {

    public Crossover(String model, String color, int speed) {
        setModel(model);
        setColor(color);
        setMaxSpeed(speed);
    }

    @Override
    public void gas() {
        System.out.println("кроссовер газует");
    }

    @Override
    public void brake() {
        System.out.println("кроссовер тормозит");
    }

    @Override
    public String toString() {
        return String.format("Кроссовер модель: %s,цвет: %s, скорость:%d",
                getModel(), getColor(), getMaxSpeed());
    }
}
