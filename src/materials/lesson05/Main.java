package materials.lesson05;

public class Main {
    public static void main(String[] args) {
        forExample();
    }

    private static void randomExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 10) + 1);
        }
    }

    private static void zaciklivanieExample() {
        int i = 1;
        while (i < 10) {
            if (i % 4 == 0)
                continue;
            System.out.println("i = " + i);
            i++;
        }
    }

    private static void forContinueExample() {
        for (int i = 0; i < 20; i++) {
            if (i % 4 == 0)
                continue;
            System.out.println("i = " + i);
        }
    }

    private static void forInForBreak() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Внешняя итерация " + i + ": ");
            for (int j = 0; j < 10; j++) {
                if (j == 4) {
                    break; // закончить цикл, если j = 4
                }
                System.out.println(" " + j + "-ая внутренняя итерация ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершен.");
    }

    private static void breakExample() {
        for (int i = 0; i < 100; i++) {
            if (i == 4) {
                break; // завершить цикл, если i = 4
            }
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }

    private static void foreachExample() {
        String[] students = new String[]
                {"Артур", "Богдана", "Леша", "Люба", "Настя", "Саша"};

        System.out.println("через for");
        for (String item : students) {
            System.out.println(item);
        }

        System.out.println("через fori");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

        }
    }

    private static void doExample() {
        int i = 10;
        do {
            System.out.println("i=" + i);
            i--;
        } while (i > 0);
    }

    private static void whileExample() {
        int i = 0;
        while (i < 0) {
            System.out.println("i=" + ++i);
        }
    }

    private static void forExample() {
        for (int i = 0; i < 10; i++) {

            System.out.println("i= " + i);
        }
    }
}
