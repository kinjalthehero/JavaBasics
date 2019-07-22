package dataStructure.ArrayList;

import java.util.*;

public class ArrayListBasics
{
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        // add
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // add - in between the array
        // Will shift other elements. It won't replace the element.
        animals.add(2, "Elephant");

        System.out.println(animals);

        // get at a given index
        String firstAnimal = animals.get(0);
        System.out.println("First animal: " + firstAnimal);

        // set
        // Modify the element at a given index
        animals.set(4, "Walmart");
        System.out.println("Modified top companies list: " + animals);

        // size
        int arraySize = animals.size();
        System.out.println("Number of animals in the list " + arraySize);

        // remove - by index
        animals.remove(4);
        System.out.println("After remove(4): " + animals);

        // remove - by object
        // first occurrence of the element
        // returns false if the element does not exist
        boolean isRemoved = animals.remove("Cat");
        System.out.println("After remove(\"Cat\"): " + animals);

        // contains
        System.out.println("Does names array contain \"Bob\"? : " + animals.contains("Lion"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Tiger\": " + animals.indexOf("Tiger"));

        // lastIndexOf
        // last occurrence of an element
        // -1 if it doesn't exist
        animals.add("Tiger");
        animals.add("Tiger");
        System.out.println("lastIndexOf \"Tiger\" : " + animals.lastIndexOf("Tiger"));

        Collections.sort(animals);
        System.out.println("After sorting : " + animals);

        /**********************************************
         ITERATIONS
         **********************************************/

        System.out.print("for loop  => ");

        // Easiest
        // for loop
        for(String tvShow: animals) {
            System.out.print(tvShow + " ");
        }

        System.out.println();
        System.out.print("For loop with index => ");

        // For loop with index
        for(int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i) + " ");
        }

        System.out.println();
        System.out.print("forEach and lambda => ");

        // forEach and lambda
        animals.forEach(tvShow -> {
            System.out.print(tvShow + " ");
        });

        System.out.println();
        System.out.print("iterator => ");

        // iterator
        Iterator<String> tvShowIterator = animals.iterator();
        while (tvShowIterator.hasNext()) {
            System.out.print(tvShowIterator.next() + " ");
        }

        System.out.println();
        System.out.print("listIterator() to print in reverse direction => ");

        // listIterator() to print in reverse direction
        ListIterator<String> tvShowListIterator = animals.listIterator(animals.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.print(tvShow + " ");
        }

        System.out.println();
        System.out.print("iterator() and forEachRemaining() => ");

        //  iterator() and forEachRemaining()
        tvShowIterator = animals.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.print(tvShow + " ");
        });

        // User defined
        List<User> users = new ArrayList<>();
        users.add(new User("Rajeev", 25));
        users.add(new User("John", 34));
        users.add(new User("Steve", 29));

        users.forEach(user -> {
            System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
        });
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}