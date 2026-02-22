package hashSet;

import java.sql.Array;
import java.util.HashSet;

public class Question41 {
    //Write a Java program to convert a hash set to an array.
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1); // duplicate ignored
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);

     Integer[] arr= hashSet.toArray(new Integer[0]);//converts hashset in to array and stores in new array arr
    }
}
