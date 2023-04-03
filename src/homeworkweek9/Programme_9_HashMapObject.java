package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMapObject {

    public static void main(String[] args) {

        //Create hashMap object called people
        Map<String, Integer> people = new HashMap<>();
        //Add keys and values (Name , Age)
        people.put("John", 35);
        people.put("Stephen", 45);
        people.put("Magnus", 38);
        people.put("Smith", 36);

        for (Map.Entry<String, Integer> p : people.entrySet()) {
            System.out.println("key"+ " " + p.getKey() + " " + " Value" + " " + p.getValue());
        }
    }
}
