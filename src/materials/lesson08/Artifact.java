package materials.lesson08;

public class Artifact {
    long number;
    String culture;
    int century;

    public Artifact(long number){
        this.number = number;
    }
    public Artifact(long number, String culture){
        this.number = number;
        this.culture = culture;
    }
    public Artifact(long number, String culture, int century){
        this.number = number;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact artifact = new Artifact(12345);
        Artifact artifact2 = new Artifact(12345, "Ацтеки");
        Artifact artifact3 = new Artifact(12345, "Ацтеки", -8);

        System.out.println(artifact);
        System.out.println(artifact2);
        System.out.println(artifact3);
    }
}