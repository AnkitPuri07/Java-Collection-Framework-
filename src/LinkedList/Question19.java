package LinkedList;

import java.util.LinkedList;

public class Question19 {
    //Write a Java program to insert the
    // specified element at the specified position in the linked list.
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

      //  linkedList.set(3,9); wrong replaces the element

        linkedList.add(3,5);//correct way

        System.out.println(linkedList);
    }
}
