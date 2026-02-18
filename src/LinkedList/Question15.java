package LinkedList;

import java.util.LinkedList;

public class Question15 {
    public static void main(String[] args) {
        //Write a Java program to append the specified element to the end of a linked list.
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);//keeps adding to the last
        linkedList.add(20);
        linkedList.add(30);
        System.out.println(linkedList);
        linkedList.addLast(40);//adds to the end of the list O(1);
        System.out.println(linkedList);
    }
}
