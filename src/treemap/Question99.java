package treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Question99 {
    //Write a Java program to get the portion of this map whose keys
    // are less than (or equal to, if inclusive is true) a given key
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

        NavigableMap<Integer,String> mapLessThanOrEqual7 =
                treeMap.headMap(7, true);

        System.out.println("Portion strictly less than 7: " + mapLessThanOrEqual7);
    }
}
