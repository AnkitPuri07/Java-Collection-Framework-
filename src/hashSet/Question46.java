package hashSet;

import java.util.HashSet;

public class Question46 {
    //Write a Java program to remove all of the elements from a hash set.
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("x");
        hashSet.add("y");
        hashSet.add("z");
        hashSet.add("i");

        System.out.println("before removing all elements : "+hashSet);
        hashSet.removeAll(hashSet);
        System.out.println("after removing all elements : "+hashSet);
    }
}
