package materials.lesson16.nogit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Map<String, Integer> string = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {//(!(scanner.next().equalsIgnoreCase("end"))){
            String w = scanner.next();
            if (w.equalsIgnoreCase("end")) {
                break;
            }
            w = w.replaceAll("[^A-Za-z']", "");
            w.split("");
            if (string.containsKey(w))
                string.put(w, string.get(w) + 1);
            else
                string.put(w, 1);
        }

        System.out.println(string);
    }
}
