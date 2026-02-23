package treeSet;

import java.util.TreeSet;

public class Question52 {
    //Write a Java program to get the number of elements in a tree set.
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

        System.out.println("Number of element in tree set : "+treeSet.size());
    }
}
