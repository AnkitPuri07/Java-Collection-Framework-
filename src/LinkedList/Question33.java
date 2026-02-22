package LinkedList;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.LinkedList;

public class Question33 {
    //Write a Java program to test an linked list is empty or not.
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        System.out.println("Is linkedlist empty? " + linkedList.isEmpty());

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        System.out.println("Is linkedlist 2 empty? " + linkedList2.isEmpty());

    }
}
