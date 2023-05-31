package materials.lesson17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while(!flag) {
//            int i = scanner.nextInt();
            try {
                int temp = scanner.nextInt();
                flag = true;
                System.out.println(temp);
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }
}
