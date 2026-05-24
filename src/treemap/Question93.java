package treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class Question93 {
    //Write a Java program to get a key-value mapping associated
    // with the greatest key and the least key in a map.
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
        System.out.println("value with highest key" +
                " , key : "  + treeMap.lastKey()+
                " value : "+treeMap.get(treeMap.lastKey()) );
    }
}
