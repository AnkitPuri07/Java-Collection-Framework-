package treemap;

import java.util.TreeMap;

public class Question88 {
    //Write a Java program to search a key in a Tree Map.
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(7,"seven");
        treeMap.put(1,"one");
        treeMap.put(6,"six");
        treeMap.put(2,"two");
        treeMap.put(9,"nine");
        treeMap.put(4,"four");
        treeMap.put(5,"five");
        treeMap.put(3,"three");
        treeMap.put(3,"III");//value overwritten
        if (treeMap.containsKey(5)) {
            System.out.println("Key 5 is present with value: " + treeMap.get(5));
        } else {
            System.out.println("Key 5 not found");
        }
    }
}
