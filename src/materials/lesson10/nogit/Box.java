package materials.lesson10.nogit;

/**
 * Задание
 Написать класс Box, с полями ширина, высота, и глубина. Написать метод поиска площади, объема. Написать метод
 нахождения самой длинной диагонали. Написать метод который определяет форму коробки
 (куб, полукуб, параллелепипед)*/
public class Box {

    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int volume() {
        return width * height * depth;
    }

    public int aria() {
        return 2 * ((width * height) * (width * depth) * (depth * height));
    }

    private boolean checkCube() {
        return width == height && height == depth;
    }

    private boolean polokus() {
        return (width == height) || (height == depth) || (width == depth);
    }

    public void figure() {
        if (checkCube()) {
            System.out.println("Данная коробка - куб");
        } else if (polokus()) {
            System.out.println("Данная коробка - полукуб");
        } else {
            System.out.println("Данная коробка - параллелепипед");
        }
    }
}
