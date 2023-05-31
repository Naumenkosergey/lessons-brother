package materials.lesson16.nogit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    private List<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {
        Task1 task = new Task1();
        for (int i = 0; i < 20; i++) {
            task.grades.add((int) (1 + Math.random() * 10));
        }
        System.out.println(task.grades);
        task.clearBad(task.grades);
        System.out.println(task.grades);

    }

    private void clearBad(List<Integer> grades) {
        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value < 4) {
                iterator.remove();
            }
        }
    }
}
