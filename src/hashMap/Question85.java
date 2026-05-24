package hashMap;

import java.util.Collection;
import java.util.HashMap;

public class Question85 {
    //Write a Java program to get a collection view of the
    // values contained in this map.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");

        Collection<String> values = map.values(); // collection view

        for (String value : values) {
            System.out.println("Value: " + value);
        }
        /*
        for(Integer key : map.keySet()){
            System.out.println("Values "+map.get(key));//O(1)
        } this is wrong and inefficient way*/
    }
}
