package treeSet;

import java.util.TreeSet;

public class Question58 {
    //Write a Java program to get an element in a
    // tree set which is strictly less than the given element.

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1011);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(82);
        treeSet.add(91);
        treeSet.add(1011);
        System.out.println("Element strictly less than  to 7 : "
                + treeSet.lower(7));
    }

}
