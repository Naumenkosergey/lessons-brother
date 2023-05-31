package materials.lesson10.nogit;

/**
 * Задание
 Создать класс ComplexNumber, описывающий комплексное число с полями содержащими действительную и мнимую
 часть числа. Описать метод поиска модуля комплексного числа, написать методы увеличения/уменьшения действительной
 и мнимой части на заданное число*/
public class ComplexNumber {
    private int real;
    private int im;

    public ComplexNumber(int real, int im) {
        this.real = real;
        this.im = im;
    }

    public double getAbs() {
        return Math.sqrt(real * real + im * im);
    }

    public void addDec(int number) {
        real += number;
    }

    public void addIm(int number) {
        im += number;
    }

    @Override
    public String toString() {
        return String.format("%d + %di", real, im);
    }
}
