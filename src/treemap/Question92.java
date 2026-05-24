package treemap;

import java.util.TreeMap;
import java.util.Comparator;

public class Question92 {
    public static void main(String[] args) {
        // TreeMap with custom comparator: descending order
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());

        treeMap.put(7, "seven");
        treeMap.put(1, "one");
        treeMap.put(6, "six");
        treeMap.put(2, "two");
        treeMap.put(9, "nine");
        treeMap.put(4, "four");
        treeMap.put(5, "five");
        treeMap.put(3, "three");

        System.out.println("TreeMap with custom sorting (descending): " + treeMap);
    }
}