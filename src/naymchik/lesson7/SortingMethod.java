package naymchik.lesson7;

public class SortingMethod {
    public static long counterBobble;
    public static long changeBobble;

    public static long[] bubbleSort(int[] array) {
        //        итерация
//        counterBobble = 0;
//        перестановка
//        changeBobble = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                counterBobble++;
                if (array[j] < array[j - 1]) {
                    int buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                    changeBobble++;
                }
            }
        }
        return new long[]{changeBobble, counterBobble};
    }


    //    итерация
    public static long counterShaker;
    //    перестановка
    public static long changeShaker;

    public static void shakerSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                counterShaker++;
                if (array[i] > array[i + 1]) {
                    change(array, i, i + 1);
                    changeShaker++;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                counterShaker++;
                if (array[i] > array[i - 1]) {
                    change(array, i, i - 1);
                    changeShaker++;
                }
            }
            left++;
        } while (left < right);
    }

    private static void change(int[] array, int i, int j) {
        int buf = array[i];
        array[i] = array[j];
        array[j] = buf;

    }


    //    итерация
    public static long counterSelect;
    //    перестановка
    public static long changeSelect;


    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = findMinIndex(array, i);
            if (i != minIndex) {
                change(array, i, minIndex);
                changeSelect++;
            }
        }
    }

    static int findMinIndex(int[] array, int indexStart) {
        int index = indexStart;
        int min = array[index];
        for (int i = index + 1; i < array.length; i++) {
            counterSelect++;
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }


    //    итерация
    public static long counterInsert;
    //    перестановка
    public static long changeInsert;

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            counterInsert++;
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            changeInsert++;
        }
    }


    //    итерация
    public static long counterMerge;
    //    перестановка
    public static long changeMerge;

    static void merge(int[] array, int[] leftArr, int[] rightArr, int sizeLeft, int sizeRight) {
        int i = 0;
        int j = 0;

        int k = 0;
        while (i < sizeLeft && j < sizeRight) {
            counterMerge++;
            if (leftArr[i] <= rightArr[j]) {
                array[k++] = leftArr[i++];
                changeMerge++;
            } else {
                array[k++] = rightArr[j++];
                changeMerge++;
            }
        }
        while (i < sizeLeft) {
            counterMerge++;
            array[k++] = leftArr[i++];
            changeMerge++;
        }
        while (j < sizeRight) {
            array[k++] = rightArr[j++];
            changeMerge++;
        }
    }

    public static void mergeSort(int[] array, int size) {
        if (size == 1)
            return;
        int middle = size / 2;
        int[] leftArr = new int[middle];
        int[] righArr = new int[size - middle];
        for (int i = 0; i < middle; i++) {
            leftArr[i] = array[i];
            counterMerge++;
        }
        for (int i = middle; i < size; i++) {
            righArr[i - middle] = array[i];
            counterMerge++;
        }
        mergeSort(leftArr, middle);
        mergeSort(righArr, size - middle);
        merge(array, leftArr, righArr, middle, size - middle);
    }


    //    итерация
    public static long counterQuick;
    //    перестановка
    public static long changeQuick;


    public static void quickSort(int[] array, int left, int right) {
        if (left >= right)
            return;
        int key = partition(array, left, right);
        quickSort(array, left, key - 1);
        quickSort(array, key + 1, right);
    }

    static int partition(int[] array, int left, int right) {
        int key = array[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            counterQuick++;
            if (array[i] <= key) {
                change(array, ++j, i);
                changeQuick++;
            }
        }
        change(array, left, j);
        changeQuick++;
        return j;
    }

}
