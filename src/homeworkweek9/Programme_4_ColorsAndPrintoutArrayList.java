package homeworkweek9;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

public class Programme_4_ColorsAndPrintoutArrayList {

    public void addColorsToList() {

        //Creating ArrayList
        ArrayList<String> list = new ArrayList<>();

        list.add("Pink"); // Adding object in arrayList
        list.add("Orange");
        list.add("Blue");
        list.add("Black");
        list.add("White");

        //using for each loop
        for (String colors : list) {
            System.out.println(colors);
        }
    }

    //Creating main method
    public static void main(String[] args) {
        Programme_4_ColorsAndPrintoutArrayList printoutArrayList = new Programme_4_ColorsAndPrintoutArrayList();
        printoutArrayList.addColorsToList();
    }
}
