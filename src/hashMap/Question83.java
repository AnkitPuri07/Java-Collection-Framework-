package hashMap;

import java.util.HashMap;

public class Question83 {
    //Write a Java program to get the
    // value of a specified key in a maps.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");

        System.out.println("value of key 4 : "+map.get(4));//O(1)
    }


}
