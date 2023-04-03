package homeworkweek9;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 */
public class Programme_11_CompareTwoArrayList {

    public static void main(String[] args) {
        //Declaring the 1st arraylist
        ArrayList<String> c1= new ArrayList<String>();
        // Add elements to the list
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("First List:  " + c1);

        //Declaring the 2nd arraylist
        ArrayList<String> c2= new ArrayList<String>();
        // Add elements to the list
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("Second List: " + c2);

        //Comparing both list
        boolean b = c1.equals(c2); // return false because list are not equal
        if(c1.equals(c2)){
            System.out.println("The two ArrayLists are equal");
        }else {
            System.out.println("The two Arraylists are not equal");
        }

    }
}
