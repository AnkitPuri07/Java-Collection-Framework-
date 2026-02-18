package arrayList;

import java.util.ArrayList;

public class Question2 {
//    Write a Java program to create a new array list, add some colors (string) and print out the collection.
public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("green");
    colors.add("blue");
    colors.add("purple");
    colors.add("orange");
    colors.add("yellow");
    colors.add("green");
    colors.add("blue");
    colors.add("purple");
    System.out.println(colors.toString());//to string is not required
    System.out.println(colors);
    colors.forEach(System.out::println);//advanced version using for each loop
}
}
