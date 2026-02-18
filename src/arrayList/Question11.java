package arrayList;

import java.util.ArrayList;

public class Question11 {
    // Java program to join two ArrayLists
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        // Join list2 into list1
        list1.addAll(list2); // O(m) → m = size of list2

        System.out.println("Joined list: " + list1);
    }
}
