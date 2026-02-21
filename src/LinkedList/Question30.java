package LinkedList;

import java.util.LinkedList;

public class Question30 {
//Write a Java program to check if a particular element exists in a linked list.
public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.addFirst(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(4);
    linkedList.addLast(5);

    System.out.println("Does 5 exist in linked list : "+linkedList.contains(5));
}
}
