package hashSet;

import java.util.HashSet;

public class Question38 {
    //Write a Java program to empty a hash set.
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

        System.out.println(hashSet);

        hashSet.removeAll(hashSet);
        System.out.println("After removing all elements from hashSet: " + hashSet);
    }
}
