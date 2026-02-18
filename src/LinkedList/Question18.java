package LinkedList;

import java.util.LinkedList;

public class Question18 {
    //Write a Java program of swap two elements in a linked list
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        Integer temp = linkedList.indexOf(4);
        Integer temp2 = linkedList.indexOf(5);
        linkedList.set(temp,5);
        linkedList.set(temp2,4);
        System.out.println(linkedList);
    }
}
