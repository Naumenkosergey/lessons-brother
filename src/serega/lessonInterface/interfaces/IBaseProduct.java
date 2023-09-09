package serega.lessonInterface.interfaces;

public interface IBaseProduct {
    String getCost();
    void calculate(int a, int b);

    default int calc() {
        return 2 + 3;
    }
}
