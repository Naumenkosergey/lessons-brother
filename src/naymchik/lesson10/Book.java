package naymchik.lesson10;

import java.util.Date;

/**
 * Задание
 * Создать класс Book, в котором описать поля название книги, количество страниц, цена книги, год издания.
 * -Описать метод увеличения цены книги в 2 раза, если в названии книги есть слово «программирование».
 * -Написать метод который высчитывает стоимость страницы книги.
 * -Если год издания превышает 5 лет, то стоимость книги уменьшается на 5 процентов, и каждые пять лет продолжает
 * уменьшаться, максимальное уменьшение составляет 50 процентов
 */
public class Book {
    private String nameBook;
    private int pages;
    private int price;
    private int yearPublic;

    public Book() {
    }

    public Book(String nameBook, int pages, int price, int yearPublic) {
        this.nameBook = nameBook;
        this.pages = pages;
        this.price = price;
        this.yearPublic = yearPublic;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    //    -Написать метод который высчитывает стоимость страницы книги.
    public double pricePage() {
        return (double) this.price / this.pages;
    }

    //    * -Если год издания превышает 5 лет, то стоимость книги уменьшается на 5 процентов, и каждые пять лет продолжает
// * уменьшаться, максимальное уменьшение составляет 50 процентов
    public double changePrice() {
        Date dt = new Date();
        int thisYear = dt.getYear() + 1900;
        System.out.println("Год издания: " + thisYear);
        int yearBook = thisYear - this.yearPublic;
        if (yearBook >= 50) {
            this.price -= price * 0.5;
        } else {
            System.out.println("скидка = " + price * (yearBook / 5) * 0.05);
            this.price -= (double) price * (yearBook / 5) * 0.05;
        }
        return this.price;
    }


    //    * -Описать метод увеличения цены книги в 2 раза, если в названии книги есть слово «программирование».
    public double checkName() {
        if (this.nameBook.toLowerCase().contains("программирование")) {
            this.price *= 2;
        }
        return this.price;
    }


}
