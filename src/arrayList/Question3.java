package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Question3 {
    //How will you reverse a List?
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Violet");

        Collections.reverse(colors);//this is the advanced and proper way Big O(1)


    }
}
