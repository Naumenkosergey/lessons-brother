package naymchik.lesson9.homework;

public class Work {
    public static void main(String[] args) {
        String str = "юра";// - String в pool строк
        String str1 = "юра";// - String в pool строк
        String str2 = new String("юра");// - String в Haep строк
        String str3 = "юра".intern();// - String в pool строк
        String str4 = new String("юра").intern();// - String в pool строк


        System.out.println("str=str1?:"  +  (str == str1));
        System.out.println("str1=str2?:"  +  (str1 == str2));
        System.out.println("str1=str3?:"  +  (str1 == str3));
        System.out.println("str2=str4?:"  +  (str2 == str4));

        StringBuilder stringBuilder= new StringBuilder("Юра супер!");
       stringBuilder.reverse();

    }
}
