package materials.lesson11;

public class Calculator {

    public int sum(int... params) {
        int sum = 0;
        for (int item : params) {
            sum += item;
        }
        return sum;
    }
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

}

class Program{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5.5, 12.5));
        System.out.println(calculator.sum(7, 12));
        System.out.println(calculator.sum(7, 12));
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
