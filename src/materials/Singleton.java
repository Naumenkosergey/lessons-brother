package materials;

public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }

}

class RunnerSing {
    public static void main(String[] args) {
       Singleton singleton = Singleton.getInstance();
       Singleton singleton2 = Singleton.getInstance();
       Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton == singleton3);
    }
}
