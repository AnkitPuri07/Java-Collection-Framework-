package hashSet;

import java.util.HashSet;

public class Question45 {
    //Write a Java program to compare two sets and retain elements which are the same on both sets.
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

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("a");
        hashSet1.add("b");
        hashSet1.add("c");
        hashSet1.add("d");
        hashSet1.add("e");
        hashSet1.add("f");
        hashSet1.add("g");
        hashSet1.add("h");
        hashSet1.add("i");

        hashSet1.retainAll(hashSet);//sets value of hash set to A intersection B
        System.out.println(hashSet1);
    }
}
