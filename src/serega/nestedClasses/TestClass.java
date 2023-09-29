package serega.nestedClasses;

public class TestClass {

    private int a;

    private Cow b;

    public TestClass(){
        this.b.a = 10;
    }

    static class Cow{
        private int a;
        int b;
        int c;
    }
}
