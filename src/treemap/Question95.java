package treemap;

import java.util.TreeMap;

public class Question95 {
    //Write a Java program to get a reverse order
    // view of the keys contained in a given map.
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

        for(Integer key : treeMap.descendingKeySet()){
            System.out.println(key + " : " + treeMap.get(key));
        }
    }
}
