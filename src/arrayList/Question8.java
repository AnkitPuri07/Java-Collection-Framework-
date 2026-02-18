package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Question8 {
    public static void main(String[] args) {
        //Write a Java program to sort a given array list.
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ankit");
        list.add("Daniel");
        list.add("Sahaj");
        list.add("Arbin");
        list.add("shiva");

        System.out.println(list); //unsorted list

        Collections.sort(list);
        System.out.println(list); //sorted list
    }
}
