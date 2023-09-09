package serega.lessonInterface.interfaces;

public interface ISpeedObject {
    String getSpeed();

    default int calc() {
        return 2 + 10;
    }

}
