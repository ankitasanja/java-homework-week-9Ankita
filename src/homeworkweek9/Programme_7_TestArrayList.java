package homeworkweek9;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */
public class Programme_7_TestArrayList {

    public static void main(String[] args) {
        //Creating an empty Integer arrayList
        ArrayList<String> arr = new ArrayList();

        //Check if the list is empty or not using function
        boolean ans = arr.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");
        //Printing all the elements available in arraylist
        System.out.println("ArrayList = " + arr);

        //use add() method to add the elements to the arraylist
        arr.add("Red");
        arr.add("Orange");
        arr.add("White");
        arr.add("Black");
        arr.add("Purple");
        arr.add("Green");
        //check if list is empty or not
        ans = arr.isEmpty();
        if (ans == true) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");
            //Printing all the elements in the arraylist
            System.out.println("ArrayList = " + arr);
        }
    }
}
