package serega.lessonInterface;


import serega.lessonInterface.impl.animal.Cat;
import serega.lessonInterface.impl.animal.Cheetah;
import serega.lessonInterface.impl.animal.Dog;
import serega.lessonInterface.impl.animal.Tiger;
import serega.lessonInterface.impl.house.Hotel;
import serega.lessonInterface.impl.house.StateHouse;
import serega.lessonInterface.impl.ship.FightsShip;
import serega.lessonInterface.impl.ship.TransportShip;
import serega.lessonInterface.interfaces.IBaseProduct;
import serega.lessonInterface.interfaces.ISpeedObject;

public class Runner {

    public static void main(String[] args) {
        IBaseProduct ship = new TransportShip(40000000);
        IBaseProduct ship2 = new FightsShip(10000000);
        IBaseProduct house1 = new Hotel(1000);
        IBaseProduct house2 = new StateHouse(100);
        ISpeedObject dog = new Dog(10);
        ISpeedObject cat = new Cat(1);
        ISpeedObject tiger = new Tiger(20);
        ISpeedObject cheetah = new Cheetah(40);

        ISpeedObject[] animals ={tiger, cat, cheetah, dog  };


        System.out.println(ship.getCost());
        System.out.println(ship2.getCost());
        System.out.println(house1.getCost());
        System.out.println(house2.getCost());
        System.out.println(dog.getSpeed());
        System.out.println(cat.getSpeed());
        System.out.println(house1.calc());
        System.out.println(ship.calc());

        print(animals);
        System.out.println("Сортированный массив зверей по скорости");
        print(animals);


    }

    static void print(ISpeedObject[] animals){
        for (ISpeedObject animal : animals) {
            System.out.println(animal);
        }
    }
}
