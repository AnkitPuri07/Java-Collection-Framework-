package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Question24 {
    public static void main(String[] args) {
        //Write a Java program to shuffle the elements in a linked list.
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        Collections.shuffle(linkedList);
        System.out.println(linkedList);

    }
}
