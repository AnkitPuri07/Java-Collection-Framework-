package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BasicArrayListUnderstanding {

    /*
     * ArrayList is a resizable array implementation
     * from the Java Collections Framework.
     *
     * - It stores elements in insertion order.
     * - It allows duplicate values.
     * - It works only with objects (use wrapper classes for primitives).
     * - It provides dynamic resizing unlike normal arrays.
     */

    public static void main(String[] args) {

        // Declaring an ArrayList that stores Integer objects
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add(1); // index 0
        arrayList.add(2); // index 1
        arrayList.add(3); // index 2
        arrayList.add(4);
        arrayList.add(4); // duplicates allowed

        // Returns number of elements
        System.out.println(arrayList.size());

        // Removes element at index 2 (not value 2)
        arrayList.remove(2);

        // Returns first index of value 4
        System.out.println(arrayList.indexOf(4));

        // Checks if value 5 exists
        System.out.println(arrayList.contains(5));

        // Checks if list is empty
        System.out.println(arrayList.isEmpty());

        // Iterating using forEach (method reference)
        arrayList.forEach(System.out::println);

        // Converting ArrayList to Array
        Integer[] arr2 = arrayList.toArray(new Integer[0]);

        //Collections it is important it provides so many predefined useful methods It will save a lot of time
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        Collections.replaceAll(arrayList,1,3);
        Collections.shuffle(arrayList);
        Collections.swap(arrayList,0,1);
        Collections.rotate(arrayList,1);
        Collections.rotate(arrayList,2);

    }
}
