package naymchik.lesson10;

public class RunnerRoll {
    public static void main(String[] args) {
        Roll roll1 = new Roll(32, 1024);
        System.out.println(roll1.calculateFractionPercent() + "%");
        System.out.println(roll1.sumValueDenominator());
        System.out.println(roll1.checkNumberPrime());
        roll1.checkShortFraction();


    }
}
