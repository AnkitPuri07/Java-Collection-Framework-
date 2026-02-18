package arrayList;

import java.util.ArrayList;

public class Question12 {
    public static void main(String[] args) {
        //Write a Java program to empty an array list.
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        list.removeAll(list);

        System.out.println(list);//emptied list
    }
}
