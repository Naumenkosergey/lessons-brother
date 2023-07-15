package naymchik.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] a = new int[n];
        printArray(a);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Размер массива: " + array.length);
        System.out.println("Пятый элемент по порядку (математический): " + array[4]);
        System.out.println("Пятый элемент по ндексу (нематематический): " + array[5]);
        System.out.println("Сам массив:");
        printArray(array);
        modificationArray(array);
        System.out.println("Массив после изменения:");
        printArray(array);
        System.out.println("\nмассив после обмена");
        changeFirstLastElement(array);
        printArray(array);
        int min = findMin(array);
        System.out.println("\nМинимальное значени: " + min);
        printSimpleNumber(array);
    }

    private static void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    public static void modificationArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 10;
            array[i] += 10;
        }
    }

    static boolean simpleNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    static void printSimpleNumber(int[] array) {
        System.out.print("Простые числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && simpleNumber(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }

    static void changeFirstLastElement(int[] array) {
        int buf = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = buf;
    }

    static int findMin(int[] mas) {
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }
}


