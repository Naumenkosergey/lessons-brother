package serega.collections;

import serega.lesson8.Dog;

import java.util.*;

public class TestList {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));


        List<Integer> linkedList = new LinkedList<>(Arrays.asList(arr));

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(list);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(109);
        set1.add(2);
        set1.add(132);
        set1.add(15);
        set1.add(1322);
        set1.add(132222);
        System.out.println(set1.contains(33));
        System.out.println(set1);
        /**
         * создать два списка ArrayList и  LinkedList  заполнить их 10000 рандомных элементов
         * выяснить какой из списков работает быстрее:
         * на удаление из начала/конца/середины
         * на вставку в начала/конец/середину
         * */

//        прочитать
//        коллизии
//        контракт между equals и hashCode
    }
}
