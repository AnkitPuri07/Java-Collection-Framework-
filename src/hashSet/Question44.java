package hashSet;

import java.util.HashSet;

public class Question44 {
    //Write a Java program to compare two hash set.
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("a");
        hashSet1.add("b");
        hashSet1.add("c");
        hashSet1.add("d");

        System.out.println("comparing two hashsets , are they equal :"+hashSet.equals(hashSet1));
    }
}
