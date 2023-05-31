package materials.lesson10.nogit;

public class RunnerRoll {
    public static void main(String[] args) {
        Roll roll = new Roll(15, 45);
        System.out.println(roll.checkSimpleNumerator());
        System.out.println(roll.sumNumberDenominator());
        System.out.println(roll);
    }
}
