package materials.lesson15;

public class Runner {
    public static void main(String[] args) {

        MyList<String> myList = new MyList<>(2);
        myList.add("0");
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");
        myList.add("7");
        myList.add("8");
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.getCapacity());
        myList.add("9");
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.getCapacity());
        myList.add("10");
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.getCapacity());

        System.out.println(myList);
        System.out.println(myList.get(3));
        System.out.println(myList.remove(2));
        System.out.println(myList);

        myList.add(3,"666");
        myList.add(3,"667");
        myList.add(3,"668");
        myList.add(3,"669");
        System.out.println(myList);
        myList.add("-1");
        System.out.println(myList);

    }


}
