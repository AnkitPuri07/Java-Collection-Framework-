package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        //Write a Java program to compare two array lists.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        //compare with order
        if(list.equals(list2)){
            System.out.println("lists are equal in order" );
        }else {
            System.out.println("lists are not equal in order");
        }

        //compare ignoring order
        Collections.sort(list);
        Collections.sort(list2);
        if(list.equals(list2)){
            System.out.println("lists are equal");
        }else {
            System.out.println("lists are not equal ");
        }

    }
}
