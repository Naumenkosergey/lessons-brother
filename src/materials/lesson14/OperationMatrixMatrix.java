package materials.lesson14;

public class OperationMatrixMatrix {
    public static void main(String[] args) {
        int[][] matrixA1 = {{1, 2}, {0, 2}, {1, 1}};
        int[][] matrixB1 = {{-1, 2, 1}, {0, 4, 1}};
        int[][] matrixA2 = {{-1, 2, 1}, {0, 4, 1}, {1, 1, 1}};
        int[][] matrixB2 = {{-1, 2}, {0, 4}};
        int[][] matrixA3 = {{1, 2}, {3, 4}};
        int[][] matrixB3 = {{5, 6}, {7, 8}, {9, 10}};
        int[][] matrixA4 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB4 = {{5, 6}, {7, 8}, {9, 10}};
        int[][] matrixA5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixA6 = {{1, 2}, {3, 4}};
        int[][] matrixB6 = {{5, 6, 7}, {8, 9, 10}, {11, 12, 13}};
        int[][] matrixC = mul(matrixA1, matrixB1);
        print("Произведение", matrixC);
        int[][] matrixC1 = add(matrixA1, matrixB1);
        int[][] matrixC2 = add(matrixA2, matrixB2);
        int[][] matrixC3 = add(matrixA3, matrixB3);
        int[][] matrixC4 = add(matrixA4, matrixB4);
        int[][] matrixC5 = add(matrixA5, matrixB5);
        int[][] matrixC6 = add(matrixA6, matrixB6);
        print("Сумма1", matrixC1);
        print("Сумма2", matrixC2);
        print("Сумма3", matrixC3);
        print("Сумма4", matrixC4);
        print("Сумма5", matrixC5);
        print("Сумма6", matrixC6);
        int[][] matrixC8 = sub(matrixA5, matrixB5);
        int[][] matrixC7 = sub(matrixA3, matrixB3);
        print("Разность", matrixC8);
        print("Разность3", matrixC7);
//        matrixC = div(matrixA, matrixB);
//        print("Частное", matrixC);
    }

    private static int[][] div(int[][] matrixA, int[][] matrixB) {
        return null;
    }

    private static int[][] sub(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length == matrixB.length) {
            if (matrixA[0].length == matrixB[0].length) {
                int arr[][] = new int[matrixA.length][matrixA[0].length];
                for (int i = 0; i < matrixA.length; i++) {
                    for (int j = 0; j < matrixB[i].length; j++) {
                        arr[i][j] = matrixA[i][j] - matrixB[i][j];
                    }
                }
                return arr;
            }
        }
        return null;
    }

    private static int[][] add(int[][] matrixA, int[][] matrixB) {
        int row = Math.max(matrixA.length, matrixB.length);
        int col = Math.max(matrixA[0].length, matrixB[0].length);
        int[][] matrix = new int[row][col];
        int exitRow = Math.min(matrixA.length, matrixB.length);
        for (int i = 0; i < exitRow; i++) {
            int k = 0;
            int exitCol = Math.min(matrixA[0].length, matrixB[0].length);
            for (int j = 0; j < exitCol; j++) {
                matrix[i][j] = matrixA[i][j] + matrixB[i][j];
                k++;
            }
            if (matrixA[0].length == matrixB[0].length) {
                continue;
            }
            if (matrixA[0].length > matrixB[0].length) {
                matrix[i][k] = matrixA[i][k];
            } else {
                matrix[i][k] = matrixB[i][k];
            }

        }
        if (matrixA.length > matrixB.length) {
            for (int i = matrixB.length; i < matrix.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrix[i][j] = matrixA[i][j];
                }
            }
        } else {
            for (int i = matrixA.length; i < matrix.length; i++) {
                for (int j = 0; j < matrixB[0].length; j++) {
                    matrix[i][j] = matrixB[i][j];
                }
            }
        }
        return matrix;
    }

    static void print(String text, int[][] arr) {
        if (arr != null) {
            System.out.println(text + ": ");
            for (int[] item : arr) {
                for (int el : item) {
                    System.out.print(el + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println(text + " Невозможно");
        }
    }

    private static int[][] mul(int[][] matrixA, int[][] matrixB) {
        if (matrixA[0].length == matrixB.length) {
            int[][] matrix = new int[matrixA.length][matrixB[0].length];
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixB[0].length; j++) {
                    for (int k = 0; k < matrixB.length; k++) {
                        matrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
            return matrix;
        } else {
            return null;
        }
    }
}
