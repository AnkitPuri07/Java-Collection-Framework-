package LinkedList;

import java.util.LinkedList;

public class Question23 {
    public static void main(String[] args) {
      //  Write a Java program to remove a specified element from a linked list.
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.removeFirstOccurrence(5); // O(n)
        System.out.println(linkedList);

    }
}
