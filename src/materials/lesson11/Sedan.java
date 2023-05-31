package materials.lesson11;

public class Sedan extends Car {

    @Override
    public void gas() {
        System.out.println("Седан газует");
    }

    @Override
    public void brake() {
        System.out.println("Седан тормозит");
    }

    @Override
    public String toString() {
        return String.format("Седан модель: %s,цвет: %s, скорость:%d",
                getModel(), getColor(), getMaxSpeed());
    }
}
