package materials.lesson16.homework;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {
        List<String> peoples = new ArrayList<>() {{
            add("Sergey");
            add("Alexey");
            add("Artur");
            add("Alexandra");
            add("Anastasiya");
            add("lyubov");
        }};
        addPeople(peoples, "ArrayList", 100000);

        peoples = new LinkedList<>() {{
            add("Sergey");
            add("Alexey");
            add("Artur");
            add("Alexandra");
            add("Anastasiya");
            add("lyubov");
        }};
        addPeople(peoples,"LinkedList",1000000);

    }

    private static void addPeople(List<String> peoples, String typeList, int countPeople) {
        for (int i = 0; i < countPeople; i++) {
            peoples.add(String.valueOf(i));
        }
        long start = new Date().getTime();
//        System.out.println(typeList + ": " + peoples);
        System.out.println("Считалочка " + typeList + ": ");
        System.out.println("Выжил человек: " + process(peoples));
        System.out.println("Time: " + (new Date().getTime() - start) + "ms");
    }

    static String process(List<String> peoples) {
        int index = 0;
        while (peoples.size() > 1) {
            Iterator<String> iterator = peoples.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                if (++index % 2 == 0)
                    iterator.remove();
            }
        }
        return peoples.get(0);
    }
}


