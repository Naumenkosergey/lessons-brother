package naymchik.lesson7;

public class Util {
    public static int[] generateArray(int size) {
        int[] arry = new int[size];
        for (int i = 0; i < (size - 1); i++) {
            arry[i] = (int) (Math.random() * 100);
        }
        return arry;
    }
}
