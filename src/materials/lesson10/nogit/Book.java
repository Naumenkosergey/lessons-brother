package materials.lesson10.nogit;


/**
 * Задание
 Создать класс Book, в котором описать поля название книги, количество страниц, цена книги, год издания.
 Описать метод увеличения цены книги в 2 раза, если в названии книги есть слово «программирование».
 Написать метод который высчитывает стоимость страницы книги. Если год издания превышает 5 лет,
 то стоимость книги уменьшается на 5 процентов, и каждые пять лет продолжает уменьшаться, максимальное уменьшение
 составляет 50 процентов*/
public class Book {

    private String name;
    private int pages;
    private double price;
    private int year;


    public Book(String name, int pages, double price, int year) {
        this.name = name;
        this.pages = pages;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void updatePrice() {
        if (name.toLowerCase().contains("программирование")) {
            this.price *= 2;
        }
        int currentYear = 2022;
        if ((currentYear - year) > 5) {
            double percent = 0;
            while (currentYear > year && percent <= 0.5) {
                percent += 0.05;
                currentYear -= 5;
            }
            this.price *= percent;
        }
    }
}
