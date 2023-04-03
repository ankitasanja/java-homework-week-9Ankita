package homeworkweek9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values
 */
public class Programme_3_ReverseAnArray {

    public static void main(String[] args) {
        //Declaring and initializing arrayList
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Before Reversing");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("After Reversing");
        System.out.println(list);



    }
}
