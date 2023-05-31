package materials.lesson08;

public class Time {
    int hour;
    int min;
    int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time(int sec) {
        this.hour = sec / 3600;
        this.min = (sec % 3600) / 60;
        this.sec = (sec % 3600) % 60;
    }

    public static void main(String[] args) {
        Time time = new Time(5, 63, 74);
        Time time2 = new Time(1345);

        time.getTime();
        time2.getTime();
    }

    private void getTime() {
        if (min > 59) {
            this.hour = hour + min / 60;
            this.min = min % 60;
        }
        if (sec > 59) {
            this.min = min + sec / 60;
            this.sec = sec % 60;
        }
        System.out.printf("%d:%d:%d\n", this.hour, this.min, this.sec);
    }
}
