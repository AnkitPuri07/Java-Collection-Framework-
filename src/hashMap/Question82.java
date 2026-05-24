package hashMap;

import java.util.HashMap;

public class Question82 {
    //Write a Java program to create a set
    // view of the mappings contained in a map.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");

        //using for each method
        map.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });

        //using advanced for loop
        for(Integer i : map.keySet()){
            System.out.println(i+" : "+map.get(i));
        }
    }
}
