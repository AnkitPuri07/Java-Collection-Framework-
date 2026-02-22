package hashSet;

import java.util.HashSet;

public class Question35 {
    //Write a Java program to append the specified element to the end of a hash set.
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        System.out.println(hashSet);
        hashSet.add("5"); // adds element to the set if not already present, O(1) average.
                            // Order is not guaranteed
        System.out.println(hashSet);
    }
}
