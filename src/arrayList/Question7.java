package arrayList;

import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        // Java program to search an element in an ArrayList

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("c");

        // Search for first occurrence of "c"
        int index = list.indexOf("c"); // O(n) → scans list from start
        System.out.println("First occurrence of 'c' is at index: " + index);

        // Optional: search for last occurrence
        int lastIndex = list.lastIndexOf("c"); // O(n)
        System.out.println("Last occurrence of 'c' is at index: " + lastIndex);
    }
}
