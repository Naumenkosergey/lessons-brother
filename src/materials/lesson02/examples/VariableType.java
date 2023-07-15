package materials.lesson02.examples;

public class VariableType {

    public static void main(String[] args) {

        byte byteNumber = 15;
        short shortNumber = 35;
        int intNumber = 2000000000;
        long longNumber = 350_000_000_000_000L;

        float floatNumber = -2.5f;
        double doubleNumber = -2.5;

        char charNumber = 61;
        char symbols = 'd';

        boolean flag = true;

        final int CONSTANT = 5;


        System.out.println(byteNumber + " " + shortNumber + " " + intNumber + " " + longNumber + " " + floatNumber + " " +
                doubleNumber + " " + charNumber + " " + symbols + " " + flag + " " + CONSTANT);
        System.out.print(byteNumber + "\n" + shortNumber + "\n" + intNumber + "\n" + longNumber + "\n" + floatNumber + "\n" +
                doubleNumber + "\n" + charNumber + "\n" + symbols + "\n" + flag + "\n" + CONSTANT);
        System.out.printf("%d, %6d, %d, %d, %.3f, %f, %c, %c,%b, %d ", byteNumber, shortNumber, intNumber, longNumber, floatNumber,
                doubleNumber, charNumber, symbols, flag, CONSTANT);
    }

}
