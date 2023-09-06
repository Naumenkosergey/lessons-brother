package naymchik.lesson10;

public class RunnerBook {
    public static void main(String[] args) {
        Book book1 = new Book("Онегин", 350, 50, 1986);
        Book book2 = new Book("Программирование JAVA", 100, 100, 2015);
        System.out.print("Цена одной страницы: ");
        System.out.println(book1.pricePage());
        System.out.println(book1.changePrice());
        System.out.println(book2.changePrice());
        System.out.println(book2.checkName());
    }
}
