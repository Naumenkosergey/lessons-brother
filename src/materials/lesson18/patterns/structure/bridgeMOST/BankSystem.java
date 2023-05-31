package materials.lesson18.patterns.structure.bridgeMOST;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("банк в программе");
        developer.writeCode();
    }
}
