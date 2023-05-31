package materials.lesson14;

public class OperationVectorVector {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] result = add(arr1, arr2);
        print("Сложение", result);
        result = sub(arr1, arr2);
        print("Вычитание", result);
        int res = mul(arr1, arr2);
        System.out.println("Произведение: " + res);
//        print("Произведение", result);
        result = div(arr1, arr2);
        System.out.println(result);
//        print("Частное", result);

    }

    private static int[] div(int[] arr1, int[] arr2) {
        return null;
    }

    private static int mul(int[] arr1, int[] arr2) {
        int col = Math.min(arr1.length, arr2.length);
        int res = 0;
        for (int i = 0; i < col; i++) {
            res += arr1[i] * arr2[i];
        }
        return res;
    }

    private static int[] sub(int[] arr1, int[] arr2) {
        int size = Math.max(arr1.length, arr2.length);
        int[] res = new int[size];
        if (arr1.length > arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                res[i] = arr1[i] - arr2[i];
            }
            for (int i = arr2.length; i < res.length; i++) {
                res[i] = arr1[i];
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                res[i] = arr1[i] - arr2[i];
            }
            for (int i = arr1.length; i < res.length; i++) {
                res[i] = -arr2[i];
            }
        }
        return res;
    }

    private static int[] add(int[] arr1, int[] arr2) {
        int size = Math.max(arr1.length, arr2.length);
        int[] res = new int[size];
        if (arr1.length > arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                res[i] = arr1[i] + arr2[i];
            }
            for (int i = arr2.length; i < res.length; i++) {
                res[i] = arr1[i];
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                res[i] = arr1[i] + arr2[i];
            }
            for (int i = arr1.length; i < res.length; i++) {
                res[i] = arr2[i];
            }
        }
        return res;
    }


    static void print(String text, int[] arr) {
        System.out.print(text + ": ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
