package LinkedList;

import java.util.LinkedList;

public class Question32 {
    //Write a Java program to compare two linked lists.
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.addLast(1);
        linkedList2.addLast(2);
        linkedList2.addLast(3);
        linkedList2.addLast(4);
        linkedList2.addLast(5);

        System.out.println(linkedList2.equals(linkedList));
    }
}
