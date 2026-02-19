package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Question25 {
    public static void main(String[] args) {
        //Write a Java program to join two linked lists.
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);
        linkedList2.add(4);
        linkedList2.add(5);

        linkedList1.addAll(linkedList2);
        System.out.println(linkedList1);
    }
}
