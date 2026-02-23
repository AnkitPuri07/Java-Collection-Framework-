package treeSet;

import java.util.TreeSet;

public class Question49 {
    //  Write a Java program to add all the elements of a specified tree set to another tree set.

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("green");
        treeSet.add("blue");
        treeSet.add("orange");
        treeSet.add("yellow");

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.addAll(treeSet);
        System.out.println("TreeSet 2 :"+treeSet2);
    }
}
