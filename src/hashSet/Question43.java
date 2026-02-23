package hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Question43 {
    //Write a Java program to convert a hash set to a List/ArrayList.
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");

        ArrayList<String> arrayList = new ArrayList<String>(hashSet);
        System.out.println("Hashset converted to ArrayList : "+arrayList);
    }
}
