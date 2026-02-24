package treeSet;

import java.util.TreeSet;

public class Question59 {

    //Write a Java program
    // to retrieve and remove the first element of a tree set.

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1011);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(82);
        treeSet.add(91);
        treeSet.add(1011);
        System.out.println("tree set before removing first element : " + treeSet);

        System.out.println("first element : " + treeSet.first());
        //removing first element
        treeSet.remove(treeSet.first());
        System.out.println("tree set after removing first element : " + treeSet);
    }
}
