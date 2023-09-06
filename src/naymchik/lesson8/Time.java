package naymchik.lesson8;

/**
 * Время
 * Создать класс Time, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами:
 * секундами, минутами и часами. Создать метод для получения полного количества секунд в объекте.
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных. Написать программу для тестирования возможностей класса
 */
public class Time {
    byte hours;
    int minutes;
    int seconds;

    public Time(byte hour, int min, int sec) {
        this.hours = hour;
        this.minutes = min;
        this.seconds = sec;
    }

    public Time(int sec) {
        this.hours = (byte) (sec / 3600);
        this.minutes = (sec % 3600) / 60;
        this.seconds = sec % 60;
    }


    public static void main(String[] args) {
        Time time1 = new Time(24856);
        Time time2 = new Time((byte) 25, 76, 150);

        time1.PrintTime();
        time2.PrintTime();
        System.out.println(time1.getSeconds());
        System.out.println(time2.getSeconds());

    }

    public void PrintTime() {
        if (minutes > 59) {
            this.hours = (byte) (hours + minutes / 60);
            this.minutes = minutes % 60;
        }
        if (seconds > 59) {
            this.minutes = minutes % 60 + seconds / 60;
            this.seconds = seconds % 60;
        }

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }

    public int getSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

// тоже работает, почему?
//    private void PrintTime() {
//        if (minutes > 59) {
//            hours = (byte) (hours + minutes / 60);
//            minutes = minutes % 60;
//        }
//        if (seconds > 59) {
//            minutes = minutes % 60 + seconds / 60;
//        }
//        seconds = seconds % 60;
//        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
//    }


}
