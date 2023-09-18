package serega.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyList implements MyListInterfase {
    String [] arr;

    public MyList() {
        this.arr = new String[10];
    }

    public MyList(int copacity) {
        this.arr = new String[copacity];
    }

    public boolean add(String item){
        for (int i = 0; i < arr.length; i++) {
            if (Objects.isNull(arr[i])) {
                arr[i] = item;
                return true;
            }
        }
        String[] newArr = new String[(int)(arr.length*1.5)];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = item;
        this.arr = newArr;
        return true;
    }

    public int size(){
        int count = 0;
        for (String s : this.arr) {
            if (Objects.nonNull(s)) {
               count++;
            }
        }
        return count;
    }

    public boolean add(int index, String item){
        this.arr[index] = item;
        return true;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String del = "";
        for (String s : this.arr) {
            if (Objects.nonNull(s)) {
                sb.append(del).append(s);
                del = ", ";
            }
        }

        return sb.length()!=0? sb.toString():"Empty";
    }
}
