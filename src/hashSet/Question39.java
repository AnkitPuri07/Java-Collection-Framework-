package hashSet;

import java.sql.SQLOutput;
import java.util.HashSet;

public class Question39 {
    //Write a Java program to test if a hash set is empty or not.
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

        System.out.println("Is hash set empty? " + hashSet.isEmpty());
    }
}
