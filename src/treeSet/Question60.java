package treeSet;

import java.util.TreeSet;

public class Question60 {
    //Write a Java program to retrieve and
    // remove the last element of a tree set.

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1011);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(82);
        treeSet.add(91);
        treeSet.add(1011);
        System.out.println("tree set before removing last element : " + treeSet);

        System.out.println("last element : " + treeSet.last());
        //removing first element
        treeSet.remove(treeSet.last());
        System.out.println("tree set after removing last element : " + treeSet);
    }
}
