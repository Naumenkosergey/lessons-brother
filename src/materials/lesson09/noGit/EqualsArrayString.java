package materials.lesson09.noGit;

import java.util.Scanner;

public class EqualsArrayString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String[] arrayS1 = s1.split("\\s+");
        System.out.println(equalsArray(arrayS1,s2));
    }

    private static boolean equalsArray(String[] arrayS1,String line) {
        if (arrayS1.length!=line.split(" ").length){
            return false;
        }

        for (String item:arrayS1){
            if(!line.contains(item)){
                return false;
            }
        }
        return true;
    }
}
