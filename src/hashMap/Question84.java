package hashMap;

import java.util.HashMap;

public class Question84 {
    //Write a Java program to get
    // a set view of the keys contained in this map.

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");

        for(Integer key : map.keySet()){
            System.out.println(key);
        }
    }
}
