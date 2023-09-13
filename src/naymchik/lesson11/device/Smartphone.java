package naymchik.lesson11.device;

public class Smartphone extends Device {
    public Smartphone(String title, String font, boolean frame) {
        super(title, font, frame);
    }

    public Smartphone() {
    }


    public void smartphonePrint() {
        System.out.printf("Устройство смартфон: Заголовок - %s, шрифт - %s, наличие рамки - %b \n",
                getTitle(), getFont(), getFrame());
    }
}
