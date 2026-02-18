package arrayList;

import java.util.ArrayList;

public class Question5 {

    public static void main(String[] args) {
        //Write a Java program to retrieve an element (at a specified index) from a given array list.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(0)); // getting element of index 0
        int index0 = list.get(0);// accessing by index is Big O(1) always constant time
        System.out.println(index0);
    }
}
