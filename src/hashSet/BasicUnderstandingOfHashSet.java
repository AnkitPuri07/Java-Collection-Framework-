package hashSet;

import java.util.HashSet;

public class BasicUnderstandingOfHashSet {
    //HashSet is a collection
    //That does not allow same data
    //It ignores copy
    //It helps to make insertion, deletion , search fast
    //Used when data needs to vary
    //allows one single null element manages by hash table
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);//O(1) most of the time
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);

        System.out.println(hashSet);//output: 1,2 ignores same element output may vary

        hashSet.remove(1);//O(1)
        System.out.println(hashSet);
        System.out.println(hashSet.contains(6));//O(1)

        /*Order: HashSet does not maintain insertion order
        If order matters → use LinkedHashSet
        If sorted order matters → use TreeSet
        */

    }
}
