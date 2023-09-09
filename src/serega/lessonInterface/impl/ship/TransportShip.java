package serega.lessonInterface.impl.ship;

public class TransportShip extends BaseShip {

    public TransportShip(int cost){
       super(cost);
    }

    @Override
    public int calc() {
        return 100;
    }
}
