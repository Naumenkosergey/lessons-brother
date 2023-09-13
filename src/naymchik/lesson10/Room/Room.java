package naymchik.lesson10.Room;

import java.util.Scanner;

/**
 * Создать Класс Room, в котором описать поля ширина, высота, длина комнаты, количества окон класс Window (ширина, высота).
 * количество дверей класс Door (ширина, высота)
 * Описать метод который находит площадь комнаты (вместе с окнами и дверями).Описать метод поиска площади
 * стен комнаты за вычетом оконных и дверных проемов. Написать метод, который рассчитывает сколько обойных
 * трубок нужно потратить на переклейку данной комнаты (размер трубки 0,53м на 10м) сколько это будет стоить,
 * цену трубки пользователь вводит сам с клавиатуры.
 */

public class Room {
    private double width;
    private double length;
    private double height;
    private Window windows;
    private Door doors;

    public Room() {
    }

    public Room(double width, double length, double height, Window windows, Door doors) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.windows = windows;
        this.doors = doors;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Window getWindows() {
        return windows;
    }

    public void setWindows(Window windows) {
        this.windows = windows;
    }

    public Door getDoors() {
        return doors;
    }

    public void setDoors(Door doors) {
        this.doors = doors;
    }


    //    Описать метод который находит площадь комнаты (вместе с окнами и дверями).
    public void squareRoom() {
        double square = 2 * (width + length) * height - windows.squareWindow() - doors.squareDoor();
        System.out.printf("Площадь стен с вычетом проемов S=%.2fм2 \n" , square);
    }

    //Написать метод, который рассчитывает сколько обойных трубок нужно потратить на переклейку данной комнаты
// (размер трубки 0,53м на 10м)
    public int calculationTube() {
        double square = 2 * (width + length) * height - windows.squareWindow() - doors.squareDoor();
        double squareTube = 0.53 * 10;
        int tube;
        if (square % squareTube == 0) {
            tube = (int) (square / squareTube);
        } else {
            tube = (int) (square / squareTube + 1);
        }
        return tube;
    }


// сколько это будет стоить, цену трубки пользователь вводит сам с клавиатуры.

    public double priceTube(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цену трубки обоев");
        double price = scan.nextDouble();
        return price*calculationTube();
    }

}
