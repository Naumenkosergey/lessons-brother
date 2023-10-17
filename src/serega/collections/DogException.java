package serega.collections;

public class DogException extends Throwable{
    String message = "DogException";

    @Override
    public String getMessage() {
        return message;
    }
}
