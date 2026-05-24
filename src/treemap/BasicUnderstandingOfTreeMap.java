package treemap;

import java.util.TreeMap;

public class BasicUnderstandingOfTreeMap {
    public static void main(String[] args) {
        //tree map uses red black tree internally
        //It arranges inserted data in sorted order
        //accepts multiple null value but not one null key
        //O(logn) insertion and deletion because uses self balancing tree internally
        //fast because it allows to use method like getfirstKey()
        //getLastKey() helps to get the largest and smallest keys
        //have property like ceilingKey, flooringKey, lowerKey() etc

        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(7,"seven");
        treeMap.put(1,"one");
        treeMap.put(6,"six");
        treeMap.put(2,"two");
        treeMap.put(9,"nine");
        treeMap.put(4,"four");
        treeMap.put(5,"five");
        treeMap.put(3,"three");

        System.out.println("TreeMap:"+treeMap);//gives in sorted order
    }
}
