package naymchik.lesson8;

public class Artifact {
    long number;
    String culture;
    int age;

    public Artifact() {
    }

    public Artifact(long number) {
        this.number = number;
    }

    public Artifact(long number, String culture) {
        this(number);
        this.culture = culture;
    }

    public Artifact(long number, String culture, int age) {
        this(number, culture);
        this.age = age;
    }

    @Override
    public boolean equals(Object ozer) {
        Artifact other = (Artifact) ozer;
        return this.age == other.age && this.number == other.number && this.culture.equals(other.culture);
    }

    public String toString() {
        return "Artifart{номер = " + number + ", культура - " + culture + ", век - " + age + "}";
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(1245, "Барокко", 10);
        Artifact artifact2 = new Artifact();
        artifact2.number = 378;
        artifact2.culture = "Инки";
        Artifact artifact3 = new Artifact(548);

        System.out.println(artifact1);
        System.out.println(artifact2);
        System.out.println(artifact3);


    }


}
