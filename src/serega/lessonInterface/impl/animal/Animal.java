package serega.lessonInterface.impl.animal;

import serega.lessonInterface.interfaces.ISpeedObject;

public class Animal implements ISpeedObject, Comparable<Animal> {
    private String name;
    private double speed;

    public Animal(double speed) {
        this.name = this.getClass().getSimpleName();
        this.speed = speed;
    }

    @Override
    public String getSpeed() {
        return String.format("скорость объекта %s = %.2f", name, speed);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.name.length(), other.name.length());
    }
}
