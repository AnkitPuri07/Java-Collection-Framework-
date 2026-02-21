package LinkedList;

import java.util.LinkedList;

public class Question28 {
    //Write a Java program to retrieve but does not remove, the first element of a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        int firstNumber = linkedList.getFirst();
        System.out.println(firstNumber);
        System.out.println(linkedList);

    }
}
