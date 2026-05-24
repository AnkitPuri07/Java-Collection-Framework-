package hashMap;

import java.util.HashMap;

public class Question77 {
    //Write a Java program to remove
    // all of the mappings from a map.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        System.out.println("map before removing : "+map);
        map.clear();
        System.out.println("map after removing : "+map);
    }
}
