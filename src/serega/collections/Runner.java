package serega.collections;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Task task = new Task();
        Task task2 = new Task();
        int b = 1;
        task.jopa(10);
        task2.jopa(10);

        System.out.println(task.getGrades());
//        task.getGrades().removeIf(value -> value.equals(4));
        System.out.println(task2.getGrades());
//

//        task.getGrades().add(12);
//        System.out.println(task.hashCode() == task2.hashCode());
//        System.out.println(task.equals(task2));

        System.out.println(new String("task").hashCode() == new String("task").hashCode());
        System.out.println(new String("task")==new String("task"));
        System.out.println(new String("task").equals(new String("task")));


        Map<String, String> map = new LinkedHashMap<>();
        map.put(new String("task"), "юра");
        map.put(new String("task"), "Cthutq");

        System.out.println(map.get("task"));
        System.out.println(map.size());
        System.out.println(map);

        List<Task> list = new ArrayList<>();

    }
}
