package naymchik.lesson10;

/**
 * Задание
 * Написать класс Box, с полями ширина, высота, и глубина. Написать метод поиска площади, объема. Написать метод
 * нахождения самой длинной диагонали. Написать метод который определяет форму коробки (куб, полукуб, параллелепипед)
 */
public class Box {
    private int shirina;
    private int vysota;
    private int glubina;

    public Box(int shirina, int vysota, int glubina) {
        if (shirina > 0 && vysota > 0 && glubina > 0) {
            this.shirina = shirina;
            this.vysota = vysota;
            this.glubina = glubina;
        } else {
            System.out.println("Данный Box не возможен");
        }
    }

    public Box() {
    }

    public int getShirina() {
        return shirina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }

    public int getVysota() {
        return vysota;
    }

    public void setVysota(int vysota) {
        this.vysota = vysota;
    }

    public int getGlubina() {
        return glubina;
    }

    public void setGlubina(int glubina) {
        this.glubina = glubina;
    }

    public int returnSquare() {
        return 2 * ((shirina * vysota) + (shirina * glubina) + (vysota * glubina));
    }

    public int returnVolume() {
        return shirina * vysota * glubina;
    }

    public double checkMaxDiagonal() {
        double diagonal1 = Math.sqrt(Math.pow(shirina, 2) + Math.pow(vysota, 2));
        double diagonal2 = Math.sqrt(Math.pow(shirina, 2) + Math.pow(glubina, 2));
        double diagonal3 = Math.sqrt(Math.pow(glubina, 2) + Math.pow(vysota, 2));
        return Math.max(diagonal1, Math.max(diagonal2, diagonal3));
    }

    public void infoBox() {
        if (shirina == glubina && glubina == vysota) {
            System.out.println("Коробка - куб");
        } else if (shirina == glubina || glubina == vysota || vysota == shirina){
            System.out.println("Коробка - полукуб");
        } else {
            System.out.println("Коробка - параллелепипед");
        }
    }
}
