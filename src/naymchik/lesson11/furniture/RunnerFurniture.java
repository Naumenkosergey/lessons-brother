package naymchik.lesson11.furniture;

public class RunnerFurniture {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Табуретка", 12.5, 75.0, 3, 0.6, false);
        Closet closet1 = new Closet();
        closet1.setName("Трюмо");
        closet1.setSize(13.2);
        closet1.setPrice(158);
        closet1.setMaterialHandle("пластик");
        closet1.setNumberSashes(3);
        closet1.setNumberBoxes(15);
        Shelf shelf1 = new Shelf("Полочка", 5.8, 87, 5, 14);
        Table table1 = new Table("Гостевой", 10.5, 105.6, 6, 3.5);

        chair1.chairPrint();
        closet1.closetPrint();
        shelf1.shelfPrint();
        table1.tablePrint();


    }
}
