package materials.lesson15;

public class TestMyOperation {


    public static void main(String[] args) {
        MyOperation<Double, Integer> obj1 = new MyOperation<>(5.0, 5);
        MyOperation<Integer, Integer> obj2 = new MyOperation<>(5, 5);
        MyOperation<Double, Double> obj3 = new MyOperation<>(5.0, 5.0);
        MyOperation<String, String> obj4 = new MyOperation<>("Hello", "World");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

    }

    private static <T> T amount(T a, T b) {
        return a;
    }
}
