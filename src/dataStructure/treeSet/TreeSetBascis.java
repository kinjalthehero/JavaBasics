package dataStructure.treeSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetBascis
{
    public static void main(String[] args) {

        SortedSet<String> fruits = new TreeSet<>();

        // add
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");
        System.out.println("Fruits Set : " + fruits);

        // add - Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // add - allowed because it's in lowercase.
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);

        // Finding the size of a TreeSet
        System.out.println("Number of elements in the TreeSet : " + fruits.size());

        // Check if an element exists in the TreeSet
        String name = "Orange";
        if (fruits.contains(name)) {
            System.out.println("TreeSet contains the element : " + name);
        } else {
            System.out.println("TreeSet does not contain the element : " + name);
        }

        // Navigating through the TreeSet
        System.out.println("First element : " + fruits.first());
        System.out.println("Last element : " + fruits.last());
        System.out.println("Less than an element : " + fruits.headSet("Pineapple"));

        // read using iterator
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Using for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
