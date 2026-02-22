package hashSet;

import java.util.HashSet;

public class Question37 {
    public static void main(String[] args) {
//Write a Java program to get the number of elements in a hash set.
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1); // duplicate ignored
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);

        System.out.println("Number of elements in hashSet: " + hashSet.size());
    }
}
