import java.util.HashMap;
import java.util.HashSet; 
//just use "import java.util.*"

public class HashBrown {

    public static void main(String[] args) {
        hashMap(); // stores two values (key, value)
        hashSet(); // stores one value (value)
    }

    static void hashMap() {
        // to create a HashMap
        HashMap<String, String> hashbrown = new HashMap<String, String>();

        // adding keys and values to the hashmap (key, value)
        hashbrown.put("Potato ", " Mashed");
        hashbrown.put("Oil ", " Boiling");
        hashbrown.put("Bacon ", " Butter");

        System.out.println(hashbrown); // outputs {Potato = Mashed, Bacon = Butter, Oil = Boiling}
        System.out.println("This is the size of the HashMap" + hashbrown.size() + "\n"); // outputs 3 which is the
                                                                                         // number of the items in the
                                                                                         // hashmap

        // Loop through a hashmap
        for (String i : hashbrown.keySet()) {
            System.out.println("This is a key of a hashmap " + i + "\n");
        } // prints the keys stored in the hashmap

        for (String i : hashbrown.values()) {
            System.out.println("This is a value stored in the hashmap " + i + "\n");
        } // prints the values stored in the hashmap

        hashbrown.get("Potato"); // gets the key
        hashbrown.remove("Oil"); // removes the key
        hashbrown.clear(); // clears the data in the hashbrown (hashmap)
    }

    static void hashSet() {
        HashSet<String> setHash = new HashSet<String>();

        // add values in the HashSet
        setHash.add("Potato");
        setHash.add("Salt");
        setHash.add("Pepper");
        setHash.add("Oil");
        setHash.add("Bacon");
        System.out.println(setHash);

        System.out.println("Is there a \"Potato\" in the HashSet? " + setHash.contains("Potato")); // returns true
        System.out.println("The size of the HashSet is: " + setHash.size());
        setHash.remove("Pepper"); // removes "Pepper" as a value in the HashSet
        setHash.clear(); // clears the data stored in the HashSet

        // Example of using a loop in the HashSet
        HashSet<Integer> intHash = new HashSet<Integer>();
        intHash.add(7);
        intHash.add(3);
        intHash.add(8);

        for (int i = 0; i < 10; i++){
            if (intHash.contains(i) == true){
                System.out.println("The number " + i + " is in the HashSet");
            }
            else {
                System.out.println("The number " + i + " is not in the HashSet");
            }
        }
    }
}
