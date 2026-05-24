package hashMap;

import java.util.HashMap;
import java.util.Map;

public class BasicUnderstandingOfMap {
    public static void main(String[] args) {
        //Maps are data structure or collection framework
        //where data are stored in a key value pair
        //keys are unique but values can be same
        //accepts one null key only
        //So map is abstract and cannot be instantiated
        //so you have to use hashmap or treemap to implement map
        //So basically if not mentioned you can work with hashmap
        // if you are told to work with map
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");//O(1)
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        map.remove(3);//3 is the key O(1)
        map.put(2,"II");//2 already exist so value is overwritten

    }
}
