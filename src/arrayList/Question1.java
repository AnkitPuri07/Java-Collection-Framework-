package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {
   // How would you convert an ArrayList to Array and an Array to ArrayList?

    public static void main(String[] args) {
        //converting ArrayList to Array
        ArrayList<Integer> list = new ArrayList<>();//initializing arrayList
        list.add(1);//assigning values to arraylist
        list.add(2);
        list.add(3);
        list.add(4);
        Integer[] arr = list.toArray(new Integer[0]);//converting arraylist into arrray
        Arrays.sort(arr);//sorting the value of array in ascending order
        System.out.println(Arrays.toString(arr));

        //converting array to array list
        Integer[] arr1 = {1,2,3,4,5};// intializing an array
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));//converting array to arrayList
        System.out.println(list1.toString());
   }
}
