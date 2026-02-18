package arrayList;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        // Write a Java program to iterate through all elements in an array list.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Iteration using enhanced for loop
        for (Integer i : list) {
            System.out.println(i);
        }

        //Iteration using for each
        list.forEach(System.out::println);
    }
}
