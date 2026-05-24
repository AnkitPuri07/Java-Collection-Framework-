package treemap;

import java.util.TreeMap;

public class Question91 {
    public static void main(String[] args) {
        //Write a Java program to delete all elements from a given Tree Map.
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(7,"seven");
        treeMap.put(1,"one");
        treeMap.put(6,"six");
        treeMap.put(2,"two");
        treeMap.put(9,"nine");
        treeMap.put(4,"four");
        treeMap.put(5,"five");
        treeMap.put(3,"three");

        System.out.println("before removing "+treeMap);
        treeMap.clear();
        System.out.println("after removing "+treeMap);
    }
}
