package materials.test;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        int c = 1;
        int d = a++ + b + ++c;
        System.out.println(d);
    }
}
