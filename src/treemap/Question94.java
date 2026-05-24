package treemap;

import java.util.TreeMap;

public class Question94 {
    //Write a Java program to get the first (lowest) key
    // and the last (highest) key currently in a map.
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();

        treeMap.put(7, "seven");
        treeMap.put(1, "one");
        treeMap.put(6, "six");
        treeMap.put(2, "two");
        treeMap.put(9, "nine");
        treeMap.put(4, "four");
        treeMap.put(5, "five");
        treeMap.put(3, "three");

        System.out.println("largest key : "  + treeMap.lastKey());
        System.out.println("smallest key : "  + treeMap.firstKey());
    }
}
