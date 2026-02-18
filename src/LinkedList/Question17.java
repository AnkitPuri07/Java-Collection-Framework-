package LinkedList;

import java.util.LinkedList;

public class Question17 {
    public static void main(String[] args) {
       // Write a Java program to get the first and last occurrence of the specified elements in a linked list.i
    LinkedList<Integer> linkedList1 = new LinkedList<>();


    linkedList1.add(1);
    linkedList1.add(2);
    linkedList1.add(3);
    linkedList1.add(4);
    linkedList1.add(5);
    linkedList1.add(2);

        System.out.println("first occurance of 2 : " + linkedList1.indexOf(2));
        System.out.println("last occurance of 2 : " + linkedList1.lastIndexOf(2));
    }
}
