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
    public double calculateFractionPercent() {
        System.out.print("Значение дроби: ");
        return ((double) ((this.numerator) * 100) / this.denominator);
    }

    //вычисления суммы цифр знаменателя.
    public int sumValueDenominator() {
        int sum = 0;
        int value = this.denominator;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    //определения является ли числитель простым или составным
    public String checkNumberPrime() {
        String check;
        int number = 2;
        int value = this.numerator;
        int sum = 0;
        while (number < Math.sqrt(this.numerator)) {
            if (value % number == 0) {
                sum++;
                break;
            } else {
                number++;
            }
        }
        if (sum == 0) {
            check = "Простое";
        } else {
            check = "Составное";
        }
        return check;
    }
// проверить на сокращение дроби, если дробь возможно сократить, то сократить

    public void checkShortFraction() {
        int value1 = this.numerator;
        int value2 = this.denominator;
        int number = 2;
        int valueMin = Math.min(value1, value2);
        while (number <= Math.sqrt(valueMin)) {
            if (value1 % number == 0 && value2 % number == 0) {
                value1 /= number;
                value2 /= number;
                valueMin = Math.min(value1, value2);
                number = 2;
            } else {
                number++;
            }
        }
        valueMin = Math.min(value1, value2);
        if (value1 % valueMin == 0 && value2 % valueMin == 0) {
            value1 /= valueMin;
            value2 /= valueMin;
        }
        System.out.println("дробь " + this.numerator + "/" + this.denominator + " после сокращения: "
                + value1 + "/" + value2);

    }


}
