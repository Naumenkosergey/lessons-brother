package materials.test;

public class Task3 {
    public static void main(String[] args) {

        System.out.println(Termin(1, 3));
    }

    private static int Termin(int i, int j) {
        if (i != 5)
            return i + j;
        else
            return 0;
    }
}
