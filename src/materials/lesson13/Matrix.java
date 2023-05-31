package materials.lesson13;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[1][0] = 2;
        matrix[1][1] = 3;
        print(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
