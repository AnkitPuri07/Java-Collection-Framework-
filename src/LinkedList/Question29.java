package LinkedList;

import java.util.LinkedList;

public class Question29 {
    //Write a Java program to retrieve but does not remove, the last element of a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        int lastNumber = linkedList.getLast();
        System.out.println(lastNumber);
        System.out.println(linkedList);

    }
}
