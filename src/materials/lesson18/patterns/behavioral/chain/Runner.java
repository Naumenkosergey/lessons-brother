package materials.lesson18.patterns.behavioral.chain;

public class Runner {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Все хорошо", Priority.ROUTINE);
        reportNotifier.notifyManager("Все необычно", Priority.IMPORTANT);
        reportNotifier.notifyManager("Все плохо", Priority.ASAP);
    }
}
