package hashMap;

import java.util.HashMap;

public class Question81 {
    //Write a Java program to test if a map
    // contains a mapping for the specified value.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");

        System.out.println("does map has value v "+map.containsValue("v"));
        System.out.println("does map has value vii "+map.containsValue("vii"));
    }
}
