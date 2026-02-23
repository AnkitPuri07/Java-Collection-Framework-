package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Question48 {
    //Write a Java program to iterate through all elements in a tree set.
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("green");
        treeSet.add("blue");
        treeSet.add("orange");
        treeSet.add("yellow");
        System.out.println("using for each :  ");
        treeSet.forEach(System.out::println);
        System.out.println("using advanced for loop: ");
        for(String s : treeSet){
            System.out.println(s);
        }
        System.out.println("Using iterator function : ");
       Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
