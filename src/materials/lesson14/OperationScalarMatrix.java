package materials.lesson14;

public class OperationScalarMatrix {

    public static void main(String[] args) {
        int number = 5;
        int[][] mas = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = add(mas, number);
        print("Сложение", result);
        result = sub(mas, number);
        print("Вычитание", result);
        result = mul(mas, number);
        print("Произведение", result);
        result = div(mas, number);
        print("Частное", result);
    }

    static void print(String text, int[][] arr) {
        System.out.println(text + ": ");
        for (int[] item : arr) {
            for (int el : item) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] div(int[][] mas, int n) {
        int[][] arr = new int[mas.length][mas[0].length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                arr[i][j] = mas[i][j] / n;
            }
        }
        return arr;
    }

    private static int[][] mul(int[][] mas, int n) {
        int[][] arr = new int[mas.length][mas[0].length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                arr[i][j] = mas[i][j] * n;
            }
        }
        return arr;
    }

    private static int[][] sub(int[][] mas, int n) {
        int[][] arr = new int[mas.length][mas[0].length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                arr[i][j] = mas[i][j] - n;
            }
        }
        return arr;
    }


    private static int[][] add(int[][] mas, int n) {
        int[][] arr = new int[mas.length][mas[0].length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                arr[i][j] = mas[i][j] + n;
            }
        }
        return arr;
    }
}
