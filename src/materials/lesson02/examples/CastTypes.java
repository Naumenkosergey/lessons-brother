package materials.lesson02.examples;

public class CastTypes {
    public static void main(String[] args) {
        byte b = (byte) 130;
        byte a = (byte) 256;
        int i = (int) 5000000000L;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("i = " + i);

        double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d);
    }
}
