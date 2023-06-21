package serega.lesson6;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorialNotRecursion(4));
        System.out.println(factorialRecursion(4));
    }

    private static int factorialRecursion(int n) {
        if (n == 1 || n== 0) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    private static int factorialNotRecursion(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
