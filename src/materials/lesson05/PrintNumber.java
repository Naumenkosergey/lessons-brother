package materials.lesson05;

import java.util.Scanner;

public class PrintNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int step = scanner.nextInt();
        printNumberFromZeroToTenInclude(n);
        printNumberFromTenToZeroExclude(n);
        printNumberFromNToKStep(n, k, step);
    }

    static void printNumberFromZeroToTenInclude(int n) {
        for (int i = 0; i < n + 1; i++) {
            System.out.print(i + " ");
        }
    }

    static void printNumberFromTenToZeroExclude(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    static void printNumberFromNToKStep(int n, int k, int step) {
        for (int i = n; i < k + 1; i += step) {
            System.out.print(i + " ");

        }
    }
}
