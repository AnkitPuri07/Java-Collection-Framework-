package hashSet;

import java.util.HashSet;

public class Question40 {
    //Write a Java program to clone a hash set to another hash set.
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

        HashSet<Integer> hashSet2 = (HashSet<Integer>) hashSet.clone();// (HashSet<Integer> i type casting)

        System.out.println("Original hashSet: " + hashSet);
        System.out.println("Original hashSet2 ( cloned from hashset ): " + hashSet2);

    }
}
