package dataStructure.linkedList;

import java.util.*;

public class LinkedListBasics
{
    public static void main(String[] args)
    {

        LinkedList<String> friends = new LinkedList<>();

        // add
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");
        System.out.println("Initial LinkedList_primitive : " + friends);

        // add - at at the specified position
        friends.add(3, "Lisa");
        System.out.println("After add(3, \"Lisa\") : " + friends);

        // addFirst
        // Adding an element at the beginning of the LinkedList_primitive
        friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\") : " + friends);

        // addLast
        // Adding an element at the end of the SinglyLinkedList
        friends.addLast("Jennifer");
        System.out.println("After addLast(\"Jennifer\") : " + friends);

        // ArrayList to SinglyLinkedList
        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Jesse");
        familyFriends.add("Walt");

        friends.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + friends);

        // getFirst()
        // throws NoSuchElementException if the SinglyLinkedList is empty
        String firstElement = friends.getFirst();
        System.out.println("First friend : " + firstElement);

        // getLast()
        // throws NoSuchElementException if the SinglyLinkedList is empty
        String lastElement = friends.getLast();
        System.out.println("Last friend : " + lastElement);

        // get(2)
        String stockPriceOn3rdDay = friends.get(2);
        System.out.println("3rd friend : " + stockPriceOn3rdDay);

        // removeFirst()
        String element = friends.removeFirst();  // Throws NoSuchElementException if the SinglyLinkedList is empty
        System.out.println("Removed the first friend " + element + " => " + friends);

        // removeLast()
        element = friends.removeLast();   // Throws NoSuchElementException if the SinglyLinkedList is empty
        System.out.println("Removed the last friend " + element + " => " + friends);

        // remove()
        // Remove the first occurrence of the specified element
        boolean isRemoved = friends.remove("David");
        if(isRemoved) {
            System.out.println("Removed David => " + friends);
        }

        // indexOf
        // Find the index of the first occurrence
        System.out.println("indexOf \"Steve\" : " + friends.indexOf("Steve"));

        // lastIndexOf
        // Find the index of the last occurrence of an element in the SinglyLinkedList
        System.out.println("lastIndexOf \"David\" : " + friends.lastIndexOf("David"));

        /**********************************************
         ITERATIONS
         **********************************************/
        // forEach and lambda
        friends.forEach(name -> {
            System.out.println(name);
        });

        // iterator()
        Iterator<String> humanSpeciesIterator = friends.iterator();
        while (humanSpeciesIterator.hasNext()) {
            String speciesName = humanSpeciesIterator.next();
            System.out.println(speciesName);
        }

        // iterator() and forEachRemaining()
        humanSpeciesIterator = friends.iterator();
        humanSpeciesIterator.forEachRemaining(speciesName -> {
            System.out.println(speciesName);
        });

        // listIterator()
        // ListIterator can be used to iterate over the SinglyLinkedList in both forward and backward directions
        // In this example, we start from the end of the list and traverse backwards
        ListIterator<String> humanSpeciesListIterator = friends.listIterator(friends.size());
        while (humanSpeciesListIterator.hasPrevious()) {
            String speciesName = humanSpeciesListIterator.previous();
            System.out.println(speciesName);
        }

        // simple for-each loop
        for(String speciesName: friends) {
            System.out.println(speciesName);
        }

        // Clear the SinglyLinkedList by removing all elements
        friends.clear();
        System.out.println("Cleared the SinglyLinkedList => " + friends);

        // Check if the SinglyLinkedList contains an element
        System.out.println("Does friends SinglyLinkedList contain \"Lara\"? : " + friends.contains("Rajeev"));
    }

}
