package materials.lesson02.examples;

public class BitOperation {

    public static void main(String[] args) {
        int i = 5;
        int k = 3;
        int res = i & k;
        int res2 = i | k;
        int res3 = i ^ k;
        int res4 = i >> 2;
        int res5 = i << 2;
        System.out.println(i + "&" + k + "=" + res);
        System.out.println(i + "|" + k + "=" + res2);
        System.out.println(i + "^" + k + "=" + res3);
        System.out.println(i + ">> 2" + "=" + res4);
        System.out.println(i + "<< 2" + "=" + res5);
        int old = i;
        i=~8;
        System.out.println(old + "~8" + "=" + i);
    }
}
