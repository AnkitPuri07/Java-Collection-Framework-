package hashMap;

import java.util.HashMap;

public class Question75 {
    //Write a Java program to count the
    // number of key-value (size) mappings in a map.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        System.out.println("size of map : "+map.size());
    }
}
