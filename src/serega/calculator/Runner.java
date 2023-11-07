package serega.calculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine(); //3.0+4.0

//        String[] split = input.split("[-+*/]");


//        Scalar scalar = new Scalar(split[0].trim());
        Scalar scalar = new Scalar(3);
//        Scalar scalar2 = new Scalar(split[1].trim());
        Vector vector = new Vector(new double[]{1, 2, 3});
        Matrix matrix = new Matrix(new double[][]{{1, 2, 3}, {3, 2, 1}, {2, 4, 6}});

        System.out.println(scalar.add(scalar));
        System.out.println(scalar.sub(scalar));
        System.out.println(scalar.mul(scalar));
        System.out.println(scalar.div(scalar));

        System.out.println(scalar.add(vector));
        System.out.println(scalar.sub(vector));
        System.out.println(scalar.mul(vector));
        System.out.println(scalar.div(vector));

        System.out.println(scalar.add(matrix));
        System.out.println(scalar.sub(matrix));
        System.out.println(scalar.mul(matrix));
        System.out.println(scalar.div(matrix));


        System.out.println(vector.add(scalar));
        System.out.println(vector.sub(scalar));
        System.out.println(vector.mul(scalar));
        System.out.println(vector.div(scalar));

        System.out.println(vector.add(vector));
        System.out.println(vector.sub(vector));
        System.out.println(vector.mul(vector));
        System.out.println(vector.div(vector));

        System.out.println(vector.add(matrix));
        System.out.println(vector.sub(matrix));
        System.out.println(vector.mul(matrix));
        System.out.println(vector.div(matrix));


        System.out.println(matrix.add(scalar));
        System.out.println(matrix.sub(scalar));
        System.out.println(matrix.mul(scalar));
        System.out.println(matrix.div(scalar));

        System.out.println(matrix.add(vector));
        System.out.println(matrix.sub(vector));
        System.out.println(matrix.mul(vector));
        System.out.println(matrix.div(vector));

        System.out.println(matrix.add(matrix));
        System.out.println(matrix.sub(matrix));
        System.out.println(matrix.mul(matrix));
        System.out.println(matrix.div(matrix));

    }
}
