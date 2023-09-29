package serega.generic;

import serega.lesson8.Dog;

public class TestGeneric {

    public static void main(String[] args) {
        int summaInt = summa(1, 1);
        double summaDouble = summa(1.0, 1.0);
        long summaLong = summa(1L, 1L);
        String summaString = summa("1L", "1L");

        System.out.println(summaInt);
        System.out.println(summaDouble);
        System.out.println(summaLong);
        System.out.println(summaString);

        Gen<Integer> genInt = new Gen<>();
        Gen<Double> genDouble = new Gen<>();
        Gen<Dog> genDog = new Gen<>();
        System.out.println(genInt.summaT(1, 1));
        System.out.println(genDouble.summaT(1.0, 1.0));
    }

    private static double summa(double a, double b) {
        return a + b;
    }

    private static int summa(int a, int b) {
        return a + b;
    }

    private static String summa(String a, String b) {
        return a + b;
    }

    private static long summa(long a, long b) {
        return a + b;
    }

}

class Gen<T extends Number> {
    public T summaT(T a, T b) {
        if(a instanceof Integer)
            return (T) (Integer.valueOf(a.intValue() + b.intValue()));
        else if(a instanceof Double)
            return (T) (Double.valueOf(a.doubleValue() + b.doubleValue()));
        else if(a instanceof Float)
            return (T) (Float.valueOf(a.floatValue() + b.floatValue()));

        return null;
    }
}
