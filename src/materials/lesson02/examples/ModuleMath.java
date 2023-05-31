package materials.lesson02.examples;

public class ModuleMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5.6));     //5.6
        System.out.println(Math.round(Math.PI));//3
        System.out.println(Math.round(5.6));    //6
        System.out.println(Math.round(5.5));    //6
        double c = Math.sqrt(6 * 6 + 8 * 8);
        System.out.println(c);
        System.out.println(Math.cos(60));       //-0.9524129804151563
        System.out.println(Math.cos(Math.toRadians(60)));  //0.5000000000000001
        System.out.println(Math.cos(60));       //-0.9524129804151563
        System.out.println(Math.cos(Math.toDegrees(60)));  //0.6641741461866276
        System.out.println(Math.random());      //вещественное число из [0;1)
        System.out.println(Math.random() + 3);  //вещественное число из [3;4)
        System.out.println(Math.random() * 10); //вещественное число из [0;10)
        System.out.println(Math.random() * 5 + 3);  //вещественное число из [3;8)
        System.out.println((int)(Math.random() * 5) + 3);   //целое число из [3;8)
        System.out.println((int)Math.random() * 11 - 5);    //всегда -5
        System.out.println((int)(Math.random() * 11) - 5);  //целое число из [-5;5]
        System.out.println(Math.pow(2,10)); //1024
        System.out.println(Math.sqrt(1024));    //32.0
        System.out.println(Math.pow(1024,1/10));    //1.0
        System.out.println(Math.pow(1024,1/10d));   //2.0
    }
}
