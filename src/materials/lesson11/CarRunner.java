package materials.lesson11;

public class CarRunner {
    public static void main(String[] args) {
        Sedan bmw = new Sedan();
        bmw.setModel("BMW-540");
        bmw.setColor("Черный");
        bmw.setMaxSpeed(320);

        Crossover mazda = new Crossover("MazdaCX-5","Красный", 260);
        Hatchback golf = new Hatchback("Golf7", "Синий", 300);
        Coupe audi = new Coupe("AudiA5","Белый", 340);

        Car[] cars = new Car[4];
        cars[0]=audi;
        cars[1]=bmw;
        cars[2]=mazda;
        cars[3]=golf;

        for (Car item:cars){
            System.out.println(item);
            item.gas();
            item.brake();
        }


    }
}
