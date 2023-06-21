package serega.lesson6;

public class FunctArgumentInt {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int c = b;

        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);


    }

    private static void calc(int a) {
        a += 100;
        a *= a * a;

    }
}
