package serega.collections;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Runner {

    public static void main(String[] args) throws NullPointerException {
        Task task = new Task();
        Task task2 = new Task();
        int b = 1;
        task.jopa(10);
//        task2.jopa(10);

        /** checked - та ошибка которая проверяется на момент компиляции
         unchecked - та ошибка которая не проверяется на момент компиляции , срабатывает только в момент выполнения
         */

        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);

        try {
            extracted(bufferedInputStream);
        } catch (DogException e) {
            System.out.println(e.getMessage());
        }


//        System.out.println(task2.getGrades().get(12));

        task.getGrades().removeIf(value -> value.equals(4));
        System.out.println(task2.getGrades());
//

//        task.getGrades().add(12);
//        System.out.println(task.hashCode() == task2.hashCode());
//        System.out.println(task.equals(task2));

        System.out.println(new String("task").hashCode() == new String("task").hashCode());
        System.out.println(new String("task") == new String("task"));
        System.out.println(new String("task").equals(new String("task")));


        Map<String, String> map = new LinkedHashMap<>();
        map.put(new String("task"), "юра");
        map.put(new String("task"), "Cthutq");

        System.out.println(map.get("task".hashCode()));
        System.out.println(map.size());
        System.out.println(map);

        List<Task> list = new ArrayList<>();
    }

    private static void extracted(BufferedInputStream bufferedInputStream) throws DogException {

        try {
            Integer a = null;
            a.hashCode();
        } catch (NullPointerException e) {
            throw new DogException();
        }
        finally {
            System.out.println("finaly");
        }


    }
}
