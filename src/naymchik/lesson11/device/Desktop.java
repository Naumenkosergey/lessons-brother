package naymchik.lesson11.device;

public class Desktop extends Tablet {

    private boolean updateSize;
    private String fullScreenMode;

    public Desktop(String title, String font, boolean frame, String position, int sizeWindow,
                   boolean updateSize, String fullScreenMode) {
        super(title, font, frame, position, sizeWindow);
        this.updateSize = updateSize;
        this.fullScreenMode = fullScreenMode;
    }

    public Desktop() {
    }

    public void desktopPrint() {
        System.out.printf("Устройство ПК: Заголовок - %s, шрифт - %s, наличие рамки - %b, " +
                        "положение - %s, размер окна - %d, возможность менять размеры - %b," +
                        " полноэкранный режим - %b\n",
                getTitle(), getFont(), getFrame(), getPosition(), getSizeWindow(), updateSize, fullScreenMode);
    }


}
