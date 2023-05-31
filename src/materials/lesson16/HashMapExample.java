package materials.lesson16;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        System.out.println(map.get("one"));
        System.out.println(map.get("three"));
        System.out.println(map.get("two"));
        System.out.println(map.get("four"));
        System.out.println(map.get("five"));

        System.out.println(map.values());
        System.out.println(map.keySet());

//        for (Map<String,Integer> entry:map){
//            System.out.println(entry.get());
//        }

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }

        printMap(map);

//        for (String key: map.keySet()){
//            Integer value = map.get(key);
//            map.put(key, 1);
//        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(1);
        }
        printMap(map);


    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
