package naymchik.lesson6;
import java.util.Locale;
import java.util.Scanner;

/**
 * Задание 14. Создать класс Runner, в котором и реализовать функцию main для тестирования работы класса ArrayIntCalc
 * Создать целочисленный массив, размерностью указанной пользователем, заполнить массив ручками.
 * Вызвать методы из класса ArrayIntCalc.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int n = scan.nextInt();
        System.out.print("Исходный массив:\n");
        ArrayIntCalc.printArray(arr);
        System.out.println("\nМассив после первого изменения");
        ArrayIntCalc.modificationArrayMulNumber(arr, n);
        System.out.printf(Locale.ENGLISH,"\nСреднее арифметическое значение массива: %.1f", ArrayIntCalc.findAverage(arr));
        System.out.println("\nМассив после второго изменения");
        ArrayIntCalc.modificationGreaterAverage(arr, n, ArrayIntCalc.findAverage(arr));
        System.out.println("\nМассив после третьего изменения");
        ArrayIntCalc.modificationLessAverage(arr, ArrayIntCalc.findAverage(arr));
        System.out.printf("\nМинимальный элемент: %d", ArrayIntCalc.findMin(arr));
        System.out.printf("\nМаксимальный элемент: %d", ArrayIntCalc.findMax(arr));
        System.out.printf("\nИндекс минимальный элемент: %d", ArrayIntCalc.findMinIndex(arr));
        System.out.printf("\nИндекс максимальный элемент: %d", ArrayIntCalc.findMaxIndex(arr));
        System.out.println("\nМассив после четверного измения изменения");
        ArrayIntCalc.changeMaxMinElement(arr);
        System.out.print("\nВсе четные элементы массива: ");
        ArrayIntCalc.printEven(arr);
        System.out.print("\nВсе нечетные элементы массива: ");
        ArrayIntCalc.printOdd(arr);
        System.out.printf("\nИндекс искомого элемента: %s", ArrayIntCalc.indexElement(arr, n));

    }
}
