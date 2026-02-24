package treeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Question61 {
    //Write a Java program to remove
    // a given element from a tree set.

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1011);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(82);
        treeSet.add(91);
        treeSet.add(1011);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer you want to remove : ");
        Integer integer = input.nextInt();
        if (treeSet.contains(integer)) {
            treeSet.remove(integer);
            System.out.println("tree set after removing : " + treeSet);
        }
        else{
            System.out.println("Tree set does not contain the integer : " + treeSet);
        }
    }
}
