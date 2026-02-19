package LinkedList;

import java.util.LinkedList;

public class Question26 {
    public static void main(String[] args) {
        // Original linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("Original LinkedList: " + linkedList);

        // Cloning the linked list
        @SuppressWarnings("unchecked")
        LinkedList<Integer> linkedList2 = (LinkedList<Integer>) linkedList.clone();

        System.out.println("Cloned LinkedList: " + linkedList2);
        //yo chai ma ni clear xaina hernu parxa solution chai reference ko lagi rakhi rakhya
    }
}
