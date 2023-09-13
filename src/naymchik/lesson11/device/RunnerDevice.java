package naymchik.lesson11.device;

public class RunnerDevice {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Самсунг", "Isecuper", false);
        Desktop desktop1 = new Desktop("Кэнон", "Calibri", true, "центр", 205,
                true, "есть");
        Tablet tablet1 = new Tablet("Ксяоми", "Arial", false, "левый край", 5);

        smartphone1.smartphonePrint();
        tablet1.tabletPrint();
        desktop1.desktopPrint();

    }
}
