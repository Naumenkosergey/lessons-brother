package naymchik.lesson10;

/**
 * Написать класс Roll (правильной дроби), содержащий поле числителя и знаменателя. Выразить значение дроби
 * в процентах. Написать метод, вычисления суммы цифр знаменателя. Написать метод определения является ли
 * числитель простым или составным, проверить на сокращение дроби, если дробь возможно сократить, то сократить.
 */
public class Roll {
    private int numerator;
    private int denominator;

    public Roll() {
    }

    public Roll(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
//Выразить значение дроби в процентах.
    public double calculateFractionPercent(){
        System.out.println("Значение дроби: ");
        return ((double) ((this.numerator) * 100) /this.denominator);
    }

}
