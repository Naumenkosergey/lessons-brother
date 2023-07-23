package naymchik.lesson7;

public class Util {
    public static int[] generateArray(int size) {
        int[] arry = new int[size];
        for (int i = 0; i < (size); i++) {
            arry[i] = (int) (Math.random() * size);
        }
        return arry;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean checkSort(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] <= array[i + 1]) ;
        }
        return true;
    }
}
