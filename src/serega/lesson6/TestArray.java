package serega.lesson6;

import java.util.Arrays;

/**
 * массивы это НЕИЗМЕНЯЕМЫЙ набор ОДНОТИПНЫХ элементов который записан под одним именем
 * к лементам можно обращаться по индексу
 * индекс порядковый номер элента массива
 * <p>
 * тип[] ИМЯ_МАССИВА = new тип[размер]
 * тип[] ИМЯ_МАССИВА = {элемнты через запятую}
 * длина массива поле (свойство) length
 * первый элемент массива [0]
 * последний [length-1]
 * ArrayIndexOutOfBoundsException выход за пределы массива
 */

public class TestArray {

    public static void main(String[] args) {

        int[] array = new int[8];
        createArray(array);
        int[] arraycopy = Arrays.copyOf(array, array.length);

        printArray(array, "Исходник");
        calc(array);

        printArray(array, "Новый");
        printArray(arraycopy, "копия");

        int[] newAr = new int[100];
        createArray(newAr);
        printArray(newAr, "НОВЫЙ-НОВЫЙ");

        replaceFirstToLast(array);
        printArray(array, "после замены");

        Arrays.sort(newAr);
        printArray(newAr, "отсортированный");
    }

    private static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    private static void printArray(int[] array, String message) {
        System.out.println("\n" + message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void calc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 100;
            }
        }
    }

    private static void replaceFirstToLast(int[] array) {
        int buf = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = buf;
    }
}
