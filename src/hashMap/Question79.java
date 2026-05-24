package hashMap;

import java.util.HashMap;

public class Question79 {
    //Write a Java program to get a shallow copy of a HashMap instance.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        HashMap<Integer, String> copy = new HashMap<>(map);
        System.out.println("copy of map : "+copy);
    }
}
