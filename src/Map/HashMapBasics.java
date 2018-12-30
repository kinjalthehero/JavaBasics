package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<Integer, String> zipcode = new HashMap<Integer, String>();
        zipcode.put(02140, "Cambridge");
        zipcode.put(02141, "Somerville");
        zipcode.put(02142, "Boston");
        zipcode.put(02143, "Woburn");
        zipcode.put(02144, "Arlington");

        System.out.println("City of the zipcode 02141 is " + zipcode.get(02141));
        zipcode.put(02145, "Belmont");
        System.out.println("City of the zipcode 02145 is " + zipcode.get(02145));
        System.out.println("Removed " + zipcode.remove(02141));
        System.out.println("City of the zipcode 02145 is " + zipcode.get(02141));
        System.out.println("Does list contain zipcode 02141? " + zipcode.containsKey(02144));
        System.out.println("Does list contain city Boston? " + zipcode.containsValue("Boston"));
        System.out.println("Elements in the list are " + zipcode.size());
    }
}
