package serega.iterator;

public interface MyListInterfase {

    boolean add(String item);
    boolean add(int index, String item);

    String get(int index);

    boolean remove();

    boolean remove(int index);

}
