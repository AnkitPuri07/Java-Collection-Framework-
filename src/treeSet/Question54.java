package treeSet;

import java.util.TreeSet;

public class Question54 {
    //Write a Java program to find the numbers less than 7 in a tree set.
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1011);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(82);
        treeSet.add(91);
        treeSet.add(1011);
        System.out.println("Numbers less than 7 in tree set : "+treeSet.headSet(7));
    }
}
