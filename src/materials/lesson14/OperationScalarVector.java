package materials.lesson14;

public class OperationScalarVector {

    public static void main(String[] args) {
        int number = 5;
        int[] mas = {1, 2, 3};
        int[] result = new int[mas.length];
        result = add(mas, number);
        print("Сложение", result);
        result = sub(mas, number);
        print("Вычитание", result);
        result = mul(mas, number);
        print("Произведение", result);
        result = div(mas, number);
        print("Частное", result);
    }

    static void print(String text, int[] arr) {
        System.out.print(text + ": ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private static int[] div(int[] mas, int n) {
        int[] arr = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            arr[i] = mas[i] / n;
        }
        return arr;
    }

    private static int[] mul(int[] mas, int n) {
        int[] arr = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            arr[i] = mas[i] * n;
        }
        return arr;
    }

    private static int[] sub(int[] mas, int n) {
        int[] arr = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            arr[i] = mas[i] - n;
        }
        return arr;
    }


    private static int[] add(int[] mas, int n) {
        int[] arr = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            arr[i] = mas[i] + n;
        }
        return arr;
    }
}
