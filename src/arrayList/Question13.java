package arrayList;

import java.util.ArrayList;

public class Question13 {
    public static void main(String[] args) {
        //Write a Java program to trim the capacity of an array list the current list size.
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println("Before trimming: " + list.size());
        // Note: Java doesn't provide direct capacity getter
        System.out.println("We can't see internal capacity directly, but it may be larger than size.");

        //trim capacity to current size
        list.trimToSize();


        System.out.println("After trimming: " + list.size());
        System.out.println("Internal array now matches the current list size (memory optimized).");
    }
}
