package materials.lesson18.patterns.behavioral.chain;

public class EmailNotifier extends Notifier{
    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Высылаю Email "+message);
    }
}
