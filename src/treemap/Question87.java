package treemap;

import java.util.TreeMap;

public class Question87 {
    //Write a Java program to copy a Tree Map content to another Tree Map.
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

        TreeMap<Integer,String> treeMap2 = treeMap;//this is not a copy this one is just another reference
        TreeMap<Integer,String> treeMap3 = new TreeMap(treeMap2);//this one is what I knew and actual copy
        System.out.println("copied TreeMap:"+treeMap2);
    }
}
