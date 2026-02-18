package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question14 {
    public static void main(String[] args) {
        // ========================
        // ArrayList vs LinkedList
        // ========================
        // ArrayList stores data in contiguous memory (like an array)
        // LinkedList stores data in nodes; each node has data + prev + next pointers

        // Retrieval:
        // ArrayList: get(index) -> O(1)
        // LinkedList: get(index) -> O(n)

        // Insertion/removal:
        // ArrayList: adding/removing at start or middle -> O(n)
        // LinkedList: adding/removing at start or end -> O(1)

        // ========================
        // ArrayList Example
        // ========================
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // add at end
        arrayList.add(2);
        arrayList.add(3);

        System.out.println("ArrayList before removal: " + arrayList);

        arrayList.remove(1); // remove element at index 1 (O(n) shift occurs)
        System.out.println("ArrayList after removal: " + arrayList);

        // ========================
        // LinkedList Example
        // ========================
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);  // add at end
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("LinkedList before removal: " + linkedList);

        linkedList.remove(1); // remove index 1 (still O(n), but faster than ArrayList for large size)
        System.out.println("LinkedList after removal: " + linkedList);

        // Special LinkedList operations
        linkedList.addFirst(5); // add at beginning -> O(1)
        linkedList.addLast(40); // add at end -> O(1)

        System.out.println("LinkedList after addFirst & addLast: " + linkedList);

        // Accessing elements
        System.out.println("ArrayList get(1): " + arrayList.get(1));
        System.out.println("LinkedList get(1): " + linkedList.get(1));

        // Iterating over LinkedList (for revision)
        System.out.print("LinkedList iteration: ");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
