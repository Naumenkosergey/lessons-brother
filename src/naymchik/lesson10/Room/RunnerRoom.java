package naymchik.lesson10.Room;

public class RunnerRoom {
    public static void main(String[] args) {

        Window win1 = new Window(1.6, 1.8);
        Door door1 = new Door(1, 2.1);
        Room hall = new Room(5, 4.5, 2.7, win1, door1);
        Room kitchen = new Room(4.0, 6.5, 2.7, new Window(1.5, 2.0),
                new Door(1.5, 2.1));
        Room hallway = new Room(7.0,2.2,2.7,new Window(0.0,0.0),
                new Door(1.3,2.1));
        hall.squareRoom();
        System.out.println(hall.calculationTube());
        System.out.println(hall.priceTube());


    }
}
