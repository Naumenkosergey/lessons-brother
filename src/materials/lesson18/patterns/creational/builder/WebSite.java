package materials.lesson18.patterns.creational.builder;

public class WebSite implements Builder {

    private String name;
    private Cms cms;
    private int price;

    @Override
    public Builder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder cms(Cms cms) {
        this.cms = cms;
        return this;
    }

    @Override
    public Builder price(int price) {
        this.price = price;
        return this;
    }

    @Override
    public WebSite build() {
        return this;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cms='" + cms + '\'' +
                ", price=" + price +
                '}';
    }
}
