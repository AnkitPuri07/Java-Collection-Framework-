package LinkedList;

import java.util.LinkedList;

public class Question22 {
    public static void main(String[] args) {
        //Write a Java program to display the elements and their positions in a linked list.

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

     /*   for (Integer integer : linkedList) {
            System.out.println(linkedList.indexOf(integer)+": "+ integer);
        } */ // this one is totally wrong if a element occurs more than once the logic fails

        for(int i=0;i<linkedList.size();i++){
            System.out.println(i+" : "+linkedList.get(i));
        }
    }
}
