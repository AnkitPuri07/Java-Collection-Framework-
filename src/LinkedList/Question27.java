package LinkedList;

import java.util.LinkedList;

public class Question27 {
    //Write a Java program to remove and return the first element of a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);


        int firstNumber = linkedList.removeFirst();//O(1) because its easy to remove first and last element in linked list
        System.out.println(firstNumber);
        System.out.println(linkedList);

    }
}
