package hashMap;

import java.util.HashMap;

public class Question80 {
    //Write a Java program to test if a map
    // contains a mapping for the specified key.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");

        System.out.println("does map has key 5 "+map.containsKey(5));
        System.out.println("does map has key 6 "+map.containsKey(6));
    }
}
