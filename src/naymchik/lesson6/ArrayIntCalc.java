package naymchik.lesson6;

import java.util.Arrays;

/**
 * Задание 0. Написать метод static void printArray(int[] array), для вывода массива (Можно не делать, НО....)
 * Задание 1. Написать метод public static void modificationArrayMulNumber(int[] array, int n),
 * который умножает каждый элемент на n.
 * Задание 2. Написать метод public static double findAverage (int[] array), который возвращает среднее арифметическое
 * значение (САЗ) массива.
 * Задание 3. Написать метод public static void modificationGreaterAverage(int[] array, int n, double average),
 * который прибавляет к элементам большим САЗ значение n.
 * Задание 5. Написать метод public static int findMin (int[] array), который осуществляет поиск минимального элемента массива.
 */
public class ArrayIntCalc {

    //    Задание 14. Создать класс Runner, в котором и реализовать функцию main для тестирования работы класса ArrayIntCalc
//            Создать целочисленный массив, размерностью указанной пользователем, заполнить массив ручками.
//            Вызвать методы из класса ArrayIntCalc.
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        int n = 6;
        System.out.println(arr.length);
        printArray(Arrays.copyOf(arr, arr.length));
        System.out.println(" - начальный массив");
        modificationArrayMulNumber(arr, n);
        System.out.println(" - массив с произведением на n");
        System.out.println(findAverage(arr));
//        printArray(modificationGreaterAverage(Arrays.copyOf(arr, arr.length), n, findAverage(arr)));
        System.out.println(" - массив с произведением элементов <САЗ на n");
        modificationLessAverage(arr, findAverage(arr));
        System.out.println(" - массив с произведением элементов >САЗ на -1");
        System.out.println(findMin(arr) + " - минимильное значение");
        System.out.println(findMax(arr) + " - максимальное значение");
        System.out.println(findMinIndex(arr) + " - индекс минимального значение");
        System.out.println(findMaxIndex(arr) + " - индекс максимального значение");
        Arrays.copyOf(arr, arr.length);
        System.out.println(" - массив с заменой мин на макс");
        printEven(arr);
        System.out.println(" - четные цифры массива");
        printOdd(arr);
        System.out.println(" - нечетные цифры массива");
        System.out.println(findElement(arr, n) + " - проверяет в массиве значение n");
        System.out.println(indexElement(arr, n) + " - возвращает индекс массива со значение n");


        printArray(arr);


    }

    //Задание 0. Написать метод static void printArray(int[] array), для вывода массива (Можно не делать, НО....)
    static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//
//        }
    }

    //Задание 1. Написать метод public static void modificationArrayMulNumber(int[] array, int n),
//           который умножает каждый элемент на n.
    public static void modificationArrayMulNumber(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;

        }
        printArray(array);
    }

    //Задание 2. Написать метод public static double findAverage (int[] array), который возвращает среднее арифметическое
//           значение (САЗ) массива.
    public static double findAverage(int[] array) {
        int summ = 0;
        for (int j : array) {
            summ += j;
        }
        return (double) summ / (array.length);
    }

    //Задание 3. Написать метод public static void modificationGreaterAverage(int[] array, int n, double average),
//           который прибавляет к элементам большим САЗ значение n.
    public static void modificationGreaterAverage(int[] array, int n, double average) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                array[i] += n;
            }
        }
        printArray(array);
    }

    //Задание 4. Написать метод public static void modificationLessAverage(int[] array, double average),
//           который поменяет знак на противоположный у элементов меньших САЗ.
    public static void modificationLessAverage(int[] array, double average) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                array[i] *= -1;
            }
        }
        printArray(array);
    }

    //Задание 5. Написать метод public static int findMin (int[] array), который осуществляет поиск минимального элемента массива.
    public static int findMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    //    Задание 6. Написать метод public static int findMax (int[] array), который осуществляет поиск максимального элемента массива
    public static int findMax(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    //Задание 7. Написать метод public static int findMinIndex(int[] array), который возвращает индекс минимального элемента массива
    public static int findMinIndex(int[] array) {
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    //    Задание 8. Написать метод public static int findMaxIndex(int[] array), который возвращает индекс максимального элемента массива
    public static int findMaxIndex(int[] array) {
        int max = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    //   Задание 9. Написать метод public static void changeMaxMinElement(int[] array), который поменяет местами
    //   максимальный и минимальные элементы массива
    public static void changeMaxMinElement(int[] array) {
        int a = findMax(array);
        array[findMaxIndex(array)] = findMin(array);
        array[findMinIndex(array)] = a;
        printArray(array);
    }

    //Задание 10. Написать метод public static void printEven(int[] array), который печатает все четные числа массива
    public static void printEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //    Задание 11. Написать метод public static void printOdd(int[] array), который печатает все нечетные числа массива
    public static void printOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

//    Задание 12. Написать метод public static boolean findElement(int[] array, int n), который проверяет есть ли элемент n в массиве.

    public static boolean findElement(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    //    Задание 13. Написать метод public static int indexElement(int[] array, int n), который возвращает индекс искомого элемента n,
//            если элемент не найден вернуть -1.
    public static int indexElement(int[] array, int n) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index = i;
            }
        }
        return index;
    }

}

