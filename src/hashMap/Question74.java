package hashMap;

import java.util.HashMap;

public class Question74 {
    //Write a Java program to associate the
    // specified value with the specified key in a HashMap.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        HashMap<Integer,String > map2 = new HashMap<>(map);
        System.out.println("map2 after copying from map1 : "+map2);
    }
}
