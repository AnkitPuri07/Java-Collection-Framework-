package hashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Question42 {
    //Write a Java program to convert a hash set to a tree set.
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("hashset converted to tree set : "+treeSet);
    }
}
