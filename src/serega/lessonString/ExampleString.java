package serega.lessonString;

public class ExampleString {
    public static void main(String[] args) {
        String s1 = "Юра";
        String s2 = new String("Юра");
        String s7 = new String("Юра").intern();
        String s3 = "Ю";
        String s4 = "ра";
        String s5 = s3 + s4;
        String s6 = "Юра";
//        s1 = s1+"!";
        String s10 = "a";
        String s8 = (s10+"b").intern();
        String s9 = "ab";


        System.out.println(s9==s8);
        System.out.println(s1==s7);
//        System.out.println(s1.equals(s2));
    }
}
