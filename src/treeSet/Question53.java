package treeSet;

import java.util.TreeSet;

public class Question53 {
    //Write a Java program to compare two tree sets.
    public static void main(String[] args) {
        TreeSet<Integer> tree1 = new TreeSet<>();
        tree1.add(122);
        tree1.add(23);
        tree1.add(31);
        tree1.add(421);
        tree1.add(51);
        tree1.add(62);
        tree1.add(7222);
        tree1.add(82);
        tree1.add(91);
        tree1.add(1011);

        TreeSet<Integer> tree2 = new TreeSet<>();

        tree2.add(1011); // inserting in different order but inserting same value
        tree2.add(23);
        tree2.add(31);
        tree2.add(62);
        tree2.add(421);
        tree2.add(51);
        tree2.add(91);
        tree2.add(7222);
        tree2.add(82);
        tree2.add(122);
        System.out.println("Are tree 1 and tree 2 equal :"+tree1.equals(tree2));

    }
}
