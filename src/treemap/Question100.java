package treemap;

import java.util.TreeMap;

public class Question100 {
    //Write a Java program to get the least key strictly
    // greater than the given key Return null if there is no such key
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

        if(treeMap.higherKey(3)!=null){
            System.out.println("Higher key found : "+treeMap.higherKey(3));
        }else {
            System.out.println("Higher key not found");

        }
    }
}
