package treeSet;

import java.util.TreeSet;

public class Question57 {
    //Write a Java program to get the element in
    // a tree set which is strictly greater than
    // or equal to the given element.

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1011);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(82);
        treeSet.add(91);
        treeSet.add(1011);
        System.out.println("Element less than or equal to 7 : "
                + treeSet.ceiling(7));
    }
}
