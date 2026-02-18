package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
    //Write a Java program to extract a portion of an array list.
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("shiva");
        list.add("ankit");
        list.add("arbin");
        list.add("tilak");
        list.add("sahaj");

        System.out.println(list.subList(2,5));// a portion of an array list
        System.out.println(list);
    }
}
