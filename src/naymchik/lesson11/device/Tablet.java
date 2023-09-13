package naymchik.lesson11.device;

public class Tablet extends Device {
    private String position;
    private int sizeWindow;

    public Tablet(String title, String font, boolean frame, String position, int sizeWindow) {
        super(title, font, frame);
        this.position = position;
        this.sizeWindow = sizeWindow;
    }

    public Tablet() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSizeWindow() {
        return sizeWindow;
    }

    public void setSizeWindow(int sizeWindow) {
        this.sizeWindow = sizeWindow;
    }

    public void tabletPrint() {
        System.out.printf("Устройство планшет: Заголовок - %s, шрифт - %s, наличие рамки - %b, " +
                        "положение - %s, размер окна - %d \n",
                        getTitle(), getFont(), getFrame(),getPosition(),getSizeWindow());
    }

}
