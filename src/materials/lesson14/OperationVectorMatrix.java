package materials.lesson14;

public class OperationVectorMatrix {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[][] matrix = {{1, 2, -1}, {0, 2, -3}};
        int[] res = mul(arr, matrix);
        print("Произведение", res);
    }

    private static int[] mul(int[] arr, int[][] matrix) {
        if (arr.length == matrix.length) {
            int[] vector = new int[matrix[0].length];
            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    vector[i] += matrix[j][i] * arr[j];
                }
            }
            return vector;
        }
        return null;
    }

    static void print(String text, int[] arr) {
        if (arr != null) {
            System.out.print(text + ": ");
            for (int item : arr) {
                System.out.print(item + " ");
            }
        } else {
            System.out.println(text + " Невозможно");
        }
        System.out.println();

    }
}
