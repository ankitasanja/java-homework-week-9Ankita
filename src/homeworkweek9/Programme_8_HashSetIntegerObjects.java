package homeworkweek9;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_HashSetIntegerObjects {

    public static void main(String[] args) {

        //Create a hashset object called set
        HashSet <Integer> set = new HashSet<>();
        //Add the values to the set
        set.add(4);
        set.add(7);
        set.add(8);
        System.out.println(set);

        //shows which numbers between 1 and 10 are in the set
        for (int i = 1; i<=10; i++){
            if(set.contains(i)){
                System.out.println(i + " is present in the set");
            }else{
                System.out.println(i + " is not present in the set");
            }
        }
    }
}
