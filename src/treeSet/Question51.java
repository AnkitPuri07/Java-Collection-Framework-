package treeSet;

import java.util.TreeSet;

public class Question51 {
    //Write a Java program to get the first and last elements in a tree set.
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(122);
        treeSet.add(23);
        treeSet.add(31);
        treeSet.add(421);
        treeSet.add(51);
        treeSet.add(62);
        treeSet.add(7222);
        treeSet.add(82);
        treeSet.add(91);
        treeSet.add(1011);

        System.out.println("First element : "+treeSet.first());
        System.out.println("Last element : "+treeSet.last());
    }
}
