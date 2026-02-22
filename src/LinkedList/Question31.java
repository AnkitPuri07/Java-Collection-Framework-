package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question31 {
    // Write a Java program to convert a LinkedList to an ArrayList.
    public static void main(String[] args) {

        // Create and populate LinkedList
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addLast(1); // adds element at the end
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        // Convert LinkedList to ArrayList using constructor
        // This copies all elements in order — O(n)
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);

        // Print ArrayList to verify conversion
        System.out.println(arrayList);
    }
}