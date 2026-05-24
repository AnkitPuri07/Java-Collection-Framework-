package hashMap;

import java.util.HashMap;

public class Question78 {
    //Write a Java program to check whether
    // a map contains key-value mappings (empty) or not.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        HashMap<Integer, String> map2 = new HashMap<>();
        System.out.println("Is map1 empty? "+map.isEmpty());
        System.out.println("Is map2 empty? "+map2.isEmpty());
    }
}
