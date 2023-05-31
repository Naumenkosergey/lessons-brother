package materials.lesson16;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        System.out.println(linkedList.get(6));
        System.out.println(linkedList.remove(6));
        System.out.println(linkedList);
        linkedList.add(6,52);
        System.out.println(linkedList);
    }
}
