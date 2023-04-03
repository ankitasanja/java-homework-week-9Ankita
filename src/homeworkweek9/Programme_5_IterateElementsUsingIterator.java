package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_IterateElementsUsingIterator {

    public static void main(String[] args) {
        //Declaring and initializing ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Scala");
        list.add("Ruby");

        System.out.println(list);

        //Iterating arraylist using iterator
        Iterator <String>iterator = list.iterator();


        while (iterator.hasNext()){
            String i = iterator.next();
            System.out.println(i);

        }
    }
}
