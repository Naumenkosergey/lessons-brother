package materials.lesson16;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(1000000);
        List<Integer> linkedList = new LinkedList<>();
        int countAdd = 100000;
        int countRemove = 10000;

        System.out.printf("Добавление в конец ArrayList %d: %d мс %n", countAdd, add(arrayList, countAdd, Place.LAST));
        System.err.printf("Добавление в конец LinkedList %d: %d мс %n", countAdd, add(linkedList, countAdd, Place.LAST));
        System.out.printf("Удаление из конца ArrayList  %d: %d мс %n", countRemove, remove(arrayList, countRemove, Place.LAST));
        System.err.printf("Удаление из конца LinkedList  %d: %d мс %n", countRemove, remove(linkedList, countRemove, Place.LAST));
        System.out.println("--------------------------------------");
        System.out.printf("Добавление в середину ArrayList  %d: %d мс %n", countAdd, add(arrayList, countAdd, Place.MIDDLE));
        System.err.printf("Добавление в середину LinkedList  %d: %d мс %n", countAdd, add(linkedList, countAdd, Place.MIDDLE));
        System.out.printf("Удаление из середины ArrayList  %d: %d мс %n", countRemove, remove(arrayList, countRemove, Place.MIDDLE));
        System.err.printf("Удаление из середины LinkedList  %d: %d мс %n", countRemove, remove(linkedList, countRemove, Place.MIDDLE));
        System.out.println("--------------------------------------");
        System.err.printf("Добавление в начало ArrayList  %d: %d мс %n", countAdd, add(arrayList, countAdd, Place.FIRST));
        System.out.printf("Добавление в начало LinkedList %d: %d мс %n", countAdd, add(linkedList, countAdd, Place.FIRST));
        System.err.printf("Удаление из начала ArrayList %d: %d мс %n", countRemove, remove(arrayList, countRemove, Place.FIRST));
        System.out.printf("Удаление из начала LinkedList  %d: %d мс %n", countRemove, remove(linkedList, countRemove, Place.FIRST));

    }

    private static long add(List<Integer> list, int count, Place place) {
        Date date = new Date();
        long start = date.getTime();
        if (place == Place.LAST) {
            for (int i = 0; i < count; i++) {
                list.add(i);
            }
        } else if (place == Place.MIDDLE) {
            for (int i = 0; i < count; i++) {
                list.add(list.size() / 2, i);
            }
        } else {
            for (int i = 0; i < count; i++) {
                list.add(0, i);
            }
        }
        Date date2 = new Date();
        long end = date2.getTime();
        return end - start;
    }

    private static long remove(List<Integer> list, int count, Place place) {
        Date date = new Date();
        long start = date.getTime();
        if (place == Place.LAST) {
            for (int i = 0; i < count; i++) {
                list.remove(list.size() - 1);
            }
        } else if (place == Place.MIDDLE) {
            for (int i = 0; i < count; i++) {
                list.remove(list.size() / 2);
            }
        } else {
            for (int i = 0; i < count; i++) {
                list.remove(0);
            }
        }
        Date date2 = new Date();
        long end = date2.getTime();
        return end - start;
    }
}
