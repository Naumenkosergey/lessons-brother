package materials.lesson16;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("one");
//        set.add("two");
//        set.add("one");
//        set.add("three");
//        set.add("one");
//        set.add("four");
//        set.add("one");
//
//        System.out.println(set);
//        System.out.println(set.contains("one"));
//        System.out.println(set.contains("five"));


        Set<String> set1 = new HashSet<>(){{
            add("one");
            add("two");
            add("three");
        }};
        Set<String> set2 = new HashSet<>(){{
            add("two");
            add("five");
            add("one");
        }};
        Set<String> resultSet = new HashSet<>(set1);
//        resultSet.addAll(set2);
//        resultSet.retainAll(set2);
        resultSet.removeAll(set2);
        System.out.println(resultSet);
    }
}
