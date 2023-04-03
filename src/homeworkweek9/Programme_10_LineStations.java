package homeworkweek9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */
public class Programme_10_LineStations {
    public static void main(String[] args) {

        //Create hashmap object called linePassing
        HashMap<String, ArrayList<String>> linePassing = new HashMap<>();
        linePassing.put("Angel", new ArrayList<>());
        linePassing.get("Angel").add("Northern Line");

        linePassing.put("Bank", new ArrayList<>());
        linePassing.get("Bank").add("Northern Line");
        linePassing.get("Bank").add("Central Line");
        linePassing.get("Bank").add("Waterloo & City Line");
        linePassing.get("Bank").add("DLR");
        linePassing.get("Bank").add("Central");

        linePassing.put("Bakerloo", new ArrayList<>());
        linePassing.get("Bakerloo").add("Bakerloo line");
        linePassing.get("Bakerloo").add("Jubilee line");
        linePassing.get("Bakerloo").add("Metropolitan line");
        linePassing.get("Bakerloo").add("Hammersmith & City line");

        linePassing.put("BakerStreet", new ArrayList<>());
        linePassing.get("BakerStreet").add("Bakerloo  line");
        linePassing.get("BakerStreet").add("Circle line");
        linePassing.get("BakerStreet").add("Metropolitan line");
        linePassing.get("BakerStreet").add("Jubilee line");

        HashMap<String, String> tubeZone = new HashMap<>();
        tubeZone.put("Angel", "Zone 1");
        tubeZone.put("Bank", "Zone 1");
        tubeZone.put("Bakerloo", "Zone 1");
        tubeZone.put("BakerStreet", "Zone 1");

        //Declaring Scanner for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the station name : ");
        String nameOfStation = scanner.next();
        System.out.println("Lines passing through" + nameOfStation + " is: " + linePassing.get(nameOfStation));
        System.out.println(nameOfStation + " is in the " + tubeZone.get(nameOfStation));

        //Closing the scanner object
        scanner.close();
    }
}
