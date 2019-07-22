package dataStructure.linkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasics
{
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>();

        // put
        wordNumberMapping.put("one", 1);
        wordNumberMapping.put("two", 2);
        wordNumberMapping.put("three", 3);
        wordNumberMapping.put("four", 4);

        // putIfAbsent
        // Add a new key-value pair only if the key does not exist in the LinkedHashMap, or is mapped to `null`
        wordNumberMapping.putIfAbsent("five", 5);
        System.out.println(wordNumberMapping);

        // containsKey
        System.out.println("ContainsKey: " + wordNumberMapping.containsKey("three"));

        // containsValue
        System.out.println("ContainsKey: " + wordNumberMapping.containsValue(2));

        // put - Change the value
        // Change the value associated with an existing key
        wordNumberMapping.put("three", 300);
        System.out.println("Changed three to new mapping : " + wordNumberMapping);

        // remove(key)
        // Remove a key from the LinkedHashMap
        Integer number = wordNumberMapping.remove("four");
        System.out.println("Removed John and his wife " + number + " from the mapping. New husbandWifeMapping : " + wordNumberMapping);

        // remove(key,value)
        boolean isRemoved = wordNumberMapping.remove("three", 300);
        System.out.println("Did John get removed from the mapping? : " + isRemoved);

        // forEach and lambda
        wordNumberMapping.forEach((user, city) -> {
            System.out.println(user + " => " + city);
        });

        // forEach and lambda
        wordNumberMapping.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        // iterator()
        Iterator<Map.Entry<String, Integer>> userCityMappingIterator = wordNumberMapping.entrySet().iterator();
        while (userCityMappingIterator.hasNext()) {
            Map.Entry<String, Integer> entry = userCityMappingIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // iterator() and forEachRemaining
        userCityMappingIterator = wordNumberMapping.entrySet().iterator();
        userCityMappingIterator.forEachRemaining(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });
    }
}
