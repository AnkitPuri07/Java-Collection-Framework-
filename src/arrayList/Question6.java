package arrayList;

import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        //Write a Java program to remove the third element from an array list.
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.remove(2); //removes element at index 2 (third element ) Big O(n)

        System.out.println(list);
    }
}
