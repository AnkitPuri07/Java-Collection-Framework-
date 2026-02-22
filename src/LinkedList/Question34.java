package LinkedList;

import java.util.LinkedList;

public class Question34 {
    //Write a Java program to replace an element in a linked list.
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.set(3,9);
        System.out.println(list);
    }
}
