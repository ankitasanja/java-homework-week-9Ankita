package homeworkweek9;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElements {

    public static void main(String[] args) {
        //Creating and initializing ArrayList
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);

        //Print the list of numbers
        System.out.println(number);

        //Retrieve the 1st and 4th elements
        Integer elements = number.get(0);
        System.out.println("First element: " + elements);
        elements = number.get(3);
        System.out.println("Second element: " + elements);
    }
}
