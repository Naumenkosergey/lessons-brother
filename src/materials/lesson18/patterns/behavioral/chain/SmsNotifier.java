package materials.lesson18.patterns.behavioral.chain;

public class SmsNotifier extends Notifier {
    public SmsNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Отправляю sms " + message);
    }
}
