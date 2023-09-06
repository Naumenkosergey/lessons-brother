package serega.lesson8;

public class Runner {

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 2, 13);
        //barsik.age = 2;
        //barsik.name = ;
        //System.out.println("Котик по имени "+ barsik.name +" возраст "+ barsik.age);
        System.out.println(barsik);
        barsik.say();
        //Cat.say();

        Cat cat = new Cat("Пушок", 4);
        //System.out.println("Котик по имени "+ cat.name + " возраст "+ cat.age);
        //System.out.println(cat.name);
        System.out.println(cat);

        Cat katy = new Cat("Кэти", 12, 4);
        System.out.println(katy);

        cat.say(2);

        Cat.info();

        Dog tuz = new Dog("Tuz", 2, 12);
        Dog polkan = new Dog("polkan", 1, 20);
        System.out.println(tuz.catching(barsik));
        System.out.println(tuz.catching(cat));
        System.out.println(tuz.catching(katy));

        System.out.println(Dog.danger(tuz, polkan));

        System.out.println(polkan.danger(tuz));
        System.out.println(tuz.danger(polkan));

        Cat[] cats = new Cat[3];
        cats = generateCats(3);
        for (Cat cat1 : cats) {
            System.out.println(cat1);
        }
    }

    private static Cat[] generateCats(int i) {
        Cat[] cats = new Cat[3];
        for (int j = 0; j < i; j++) {
            cats[j] = new Cat("cat"+j,(int)(Math.random()*10));
        }
        return cats;
    }
}
