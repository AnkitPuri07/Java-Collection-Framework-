package treeSet;

import java.util.TreeSet;

public class Question55 {
    //Write a Java program to get the element
    // in a tree set which is greater than or equal to the given element.

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1011);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(82);
        treeSet.add(91);
        treeSet.add(1011);
        System.out.println("Numbers more than 7 in tree set : "+treeSet.tailSet(7));
    }
}
