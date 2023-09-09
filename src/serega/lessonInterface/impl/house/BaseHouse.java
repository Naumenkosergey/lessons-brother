package serega.lessonInterface.impl.house;

import serega.lessonInterface.interfaces.IBaseProduct;

public class BaseHouse implements IBaseProduct {
    private String name;
    private int cost;

    public BaseHouse(int cost) {
        this.name = this.getClass().getSimpleName();
        this.cost = cost;
    }

    @Override
    public String getCost() {
        return String.format("стоимость объекта %s = %d", name, cost);
    }

    @Override
    public void calculate(int a, int b) {

    }

    @Override
    public int calc() {
        return 2 + 2 * 2;
    }
}
