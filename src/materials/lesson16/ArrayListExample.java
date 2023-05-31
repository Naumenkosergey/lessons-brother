package materials.lesson16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(5);

//        for (Integer item : arrayList) {
//            if (item % 2 == 0)
//                arrayList.remove(item);
//        }

        System.out.println(arrayList);

        arrayList.removeIf(integer -> integer % 2 == 0);

        System.out.println(arrayList);

//        System.out.println(arrayList);
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) % 2 == 0)
//                arrayList.remove(i);
//        }
//
//        System.out.println(arrayList);
    }
}
