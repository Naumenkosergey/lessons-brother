package materials.lesson18.patterns.behavioral.chain;

public class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Отравляем простой отчет: "+message);
    }
}
