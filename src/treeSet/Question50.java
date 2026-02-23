package treeSet;

import java.util.TreeSet;

public class Question50 {
    //Write a Java program to create a reverse order view of the elements contained in a given tree set.
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("green");
        treeSet.add("blue");
        treeSet.add("orange");
        treeSet.add("yellow");
        //use descendingSet() to print in descending order
        System.out.println("In descending order : "+treeSet.descendingSet());

    }
}
