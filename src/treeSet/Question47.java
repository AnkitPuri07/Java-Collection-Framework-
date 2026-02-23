package treeSet;

import java.util.TreeSet;

public class Question47 {
    //Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("green");
        treeSet.add("blue");
        treeSet.add("orange");
        treeSet.add("yellow");

        System.out.println(treeSet);//prints in sorted order
    }
}
