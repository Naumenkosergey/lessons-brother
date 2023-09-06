package naymchik.lesson10;

public class RunnerBox {
    public static void main(String[] args) {
        Box box = new Box(10, 10, 10);
        System.out.println("Площадь граней = " + box.returnSquare());
        System.out.println("Объем фигуры = " + box.returnVolume());
        System.out.println("Размер большей диогонали = " + box.checkMaxDiagonal());
        box.infoBox();
    }
}
