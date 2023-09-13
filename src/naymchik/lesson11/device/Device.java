package naymchik.lesson11.device;

public class Device {
    private String title;
    private String font;
    private boolean frame;

    public Device(String title, String font, boolean frame) {
        this.title = title;
        this.font = font;
        this.frame = frame;
    }

    public Device() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public boolean getFrame() {
        return frame;
    }

    public void setFrame(boolean frame) {
        this.frame = frame;
    }

//    public String toString(){
//        return String.format("Устройство: Заголовок - %s, шрифт - %s, наличие рамки - %b \n",
//                setTitle(), setFont(), setFrame());
//    }

//    public void devicePrint(){
//        System.out.printf("Устройство: Заголовок - %s, шрифт - %s, наличие рамки - %b \n",
//                this.title(),  this.font(),  this.frame());
//    }


}
