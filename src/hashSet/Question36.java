package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Question36 {
    // Write a Java program to iterate through all elements in a HashSet
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

        System.out.println("Using forEach method:");
        hashSet.forEach(System.out::println);

        System.out.println("Using enhanced for loop:");
        for(Integer i : hashSet){
            System.out.println(i);
        }

        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = hashSet.iterator();//also used for performing concurrent actions like removing numbers
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}