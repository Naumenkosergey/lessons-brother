package materials.lesson10.nogit;

/**
 * Задание
 *     Класс Rectangle c полями координаты левого верхнего угла и нижнего правого. Написать метод который рисует
 *     заданный прямоугольник звездочками на консоли, метод определяющий является ли это прямоугольник квадратом*/
public class Rectangle {

    private Point left;
    private Point right;

    public Rectangle(Point left, Point right) {
        this.left = left;
        this.right = right;
    }

    public Point getLeft() {
        return left;
    }

    public void setLeft(Point left) {
        this.left = left;
    }

    public Point getRight() {
        return right;
    }

    public void setRight(Point right) {
        this.right = right;
    }

    public boolean checkSquare() {
        return Math.abs(left.getX() - right.getX()) == Math.abs(left.getY() - right.getY());
    }

    public void draw() {
        for (int i = 0; i < right.getY(); i++) {
            for (int j = 0; j < right.getX(); j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(5, 5));
        if (rectangle.checkSquare()) {
            System.out.println("Куб");
        } else {
            System.out.println("Прямоугольник");
        }
        rectangle.draw();
    }
}

