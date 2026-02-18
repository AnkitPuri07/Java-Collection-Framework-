package LinkedList;

import java.util.LinkedList;

public class Question21 {
    public static void main(String[] args) {
        //Write a Java program to insert some elements
        // at the specified position into a linked list.

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.add(4,89);//at specified index
        linkedList.add(5,78);//at specified positon(index)
        System.out.println(linkedList);
    }
}
