package materials.lesson18.patterns.creational.builder;

public interface Builder {

    Builder name(String name);

    Builder cms(Cms cms);

    Builder price(int price);

    WebSite build();
}
