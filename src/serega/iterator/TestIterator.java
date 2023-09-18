package serega.iterator;

import org.hamcrest.internal.ArrayIterator;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class TestIterator {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyList list2 = new MyList(100);

        System.out.println(list.arr.length);
        System.out.println(list.size());
        System.out.println(list2.arr.length);
        System.out.println(list);
        System.out.println(list.add("hello"));
        System.out.println(list.add("hello2"));
        System.out.println(list.add("hello3"));
        System.out.println(list.add( "hello4"));
        System.out.println(list.add("hello5"));
        System.out.println(list.add( "hello6"));
        System.out.println(list.add( "hello7"));
        System.out.println(list.arr.length);
        System.out.println(list.size());
        System.out.println(list.add( "hello8"));
        System.out.println(list.add( "hello9"));
        System.out.println(list.add( "hello10"));
        System.out.println(list.add( "hello11"));
        System.out.println(list.arr.length);
        System.out.println(list.size());



        System.out.println(list);


    }

}
