package serega.lessonString;

public class ExampleIntegerPool {
    public static void main(String[] args) {

        int a = 4;
        int d = 500;
        int b = 4;
        Integer c = 4;
        Integer k = 4;
        Integer e = -128;
        Integer f = -128;
        boolean b1= true;
        Boolean b2 = Boolean.TRUE;

        d = f; //unboxing
        e = b; //boxing


        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(d == e);
        System.out.println(e == f);
        System.out.println(c == k);


    }

}
