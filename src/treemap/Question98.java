package treemap;

import java.util.TreeMap;
import java.util.NavigableMap;

public class Question98 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(7, "seven");
        treeMap.put(1, "one");
        treeMap.put(6, "six");
        treeMap.put(2, "two");
        treeMap.put(9, "nine");
        treeMap.put(4, "four");
        treeMap.put(5, "five");
        treeMap.put(3, "three");

        // Use NavigableMap instead of TreeMap
        NavigableMap<Integer,String> mapLessThan7 = treeMap.headMap(7, false);

        System.out.println("Portion strictly less than 7: " + mapLessThan7);
    }
}