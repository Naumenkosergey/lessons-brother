package materials.lesson10.nogit;

/**Задание
 Написать класс Roll (правильной дроби), содержащий поле числителя и знаменателя. Выразить значение дроби
 в процентах. Написать метод, вычисления суммы цифр знаменателя. Написать метод определения является ли
 числитель простым или составным, проверить на сокращение дроби, если дробь возможно сократить, то сократить.*/
public class Roll {

    private int numerator;
    private int denominator;

    public Roll(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        reduction();
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

    public int sumNumberDenominator() {
        int sum = 0;
        int a = denominator;
        while (a > 10) {
            sum += a % 10;
            a /= 10;
        }
        sum += a;
        return sum;
    }

    public boolean checkSimpleNumerator() {
        for (int i = 2; i < (int) Math.sqrt(Math.abs(numerator)); i++) {
            if (numerator % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void reduction() {
        boolean flag;
        do {
            flag = false;
            for (int i = 2; i <= Math.abs(numerator); i++) {
                if (numerator % i == 0) {
                    if (denominator % i == 0) {
                        numerator /= i;
                        denominator /= i;
                        flag = true;
                        break;
                    }
                }
            }
        } while (flag);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }


}
