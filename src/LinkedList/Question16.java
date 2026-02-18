package LinkedList;

import java.util.LinkedList;

public class Question16 {
    public static void main(String[] args) {
        //Write a Java program to iterate through all elements in a linked list.
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.forEach(System.out::println);//using advanced for each
        System.out.println("");

        //using advanced for loop
        for(Integer i : linkedList){
            System.out.println(i);
        }
    }
}
