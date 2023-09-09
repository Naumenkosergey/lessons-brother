package serega.lessonInterface.impl.ship;

import serega.lessonInterface.interfaces.IBaseProduct;
import serega.lessonInterface.interfaces.ISpeedObject;

public class BaseShip implements IBaseProduct, ISpeedObject {
    private String name;
    private int cost;

    public BaseShip(int cost) {
        this.name = this.getClass().getSimpleName();
        this.cost = cost;
    }

    @Override
    public String getCost() {
        return String.format("стоимость объекта %s = %d", name, cost);
    }

    @Override
    public void calculate(int a, int b) {
        System.out.println(a + b * cost);
    }

    @Override
    public int calc() {
        return 34;
    }

    @Override
    public String getSpeed() {
        return "скорость карабля 12 узлов";
    }
}
