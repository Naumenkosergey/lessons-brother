package materials.lesson15;

public class MyOperation<T, R> {
    private T value1;
    private R value2;

    public MyOperation(T value1, R value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return value1.toString() + value2.toString();
    }
}