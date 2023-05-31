package materials.lesson15;

public class MyList<T> {

    private T[] array;
    private int capacity = 10;
    private int current = 0;

    MyList() {
        this.array = (T[]) new Object[capacity];
    }

    MyList(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("capacity не может быть меньше 0, поэтому приравняем 10");
        }
        this.array = (T[]) new Object[this.capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public T get(int index) {
        return array[index];
    }

    public boolean add(T element) {
        if (current == capacity) {
            capacity = (int) (capacity * 1.5);
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
        array[current++] = element;
        return true;
    }

    public void add(int index, T element) {
        if (capacity > size() + 1) {
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < index; i++) {
                newArr[i] = array[i];
            }
            newArr[index] = element;
            for (int i = index + 1; i < array.length; i++) {
                newArr[i] = array[i - 1];
            }
            array = newArr;
        } else {
            capacity = (int) (capacity * 1.5);
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < index; i++) {
                newArr[i] = array[i];
            }
            newArr[index] = element;
            for (int i = index + 1; i < array.length; i++) {
                newArr[i] = array[i - 1];
            }
            array = newArr;
        }
        current++;
    }

    public T remove(int index) {
        T removedElement = array[index];
        T[] newArr = (T[]) new Object[capacity - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArr[i - 1] = array[i];
        }
        capacity--;
        array = newArr;
        return removedElement;
    }

    public int size() {
        int count = 0;
        for (T el : array) {
            if (el != null) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        String del = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                stringBuilder.append(del).append(array[i]);
                del = ", ";
            }
        }
        return stringBuilder.append("]").toString();
    }


}
