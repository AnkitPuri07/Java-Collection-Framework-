package treeSet;

import java.util.TreeSet;

public class BasicUnderstandingOfTreeSet {
    //Tree Set is sub class of set frame work
    //It ignores duplicate data like any other set
    //Internally stores data like BST so data are sorted automatically
    // Does not work like a continuous memory, it is a structure
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(2);
        treeSet.add(90);
        treeSet.add(400);
        treeSet.add(5);

        System.out.println(treeSet);
    }
}
