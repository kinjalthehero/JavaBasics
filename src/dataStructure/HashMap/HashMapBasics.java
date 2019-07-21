package dataStructure.HashMap;

import java.util.*;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<Integer, String> zipcode = new HashMap<>();

        // put
        zipcode.put(02140, "Cambridge");
        zipcode.put(02141, "Somerville");
        zipcode.put(02142, "Boston");
        zipcode.put(02143, "Woburn");
        zipcode.put(02144, "Arlington");

        // get
        System.out.println("City of the zipcode 02141 is " + zipcode.get(02141));

        // remove
        System.out.println("Removed " + zipcode.remove(02141));
        System.out.println("Removed " + zipcode.remove(02143, "Woburn"));
        System.out.println("City of the zipcode 02145 is " + zipcode.get(02141));

        //size
        System.out.println("Elements in the list are " + zipcode.size());

        // isEmpty()
        System.out.println("Is zipcode table is empty? " + zipcode.isEmpty());

        // containsKey
        System.out.println("Does list contain zipcode 02141? " + zipcode.containsKey(02144));

        // containsValue
        System.out.println("Does list contain city Boston? " + zipcode.containsValue("Boston"));

        // entrySet
        // [1120=Cambridge, 1122=Boston, 1124=Arlington]
        Set<Map.Entry<Integer, String>> entries = zipcode.entrySet();
        System.out.println("Map entries : " + entries);

        // keySet
        // [1120, 1122, 1124]
        Set<Integer> zipcodes = zipcode.keySet();
        System.out.println("zipcodes : " + zipcodes);

        // values
        // [Cambridge, Boston, Arlington]
        Collection<String> cities = zipcode.values();
        System.out.println("cities : " + cities);

        /**********************************************
         ITERATIONS
         **********************************************/

        // Easiest
        // For loop
        for (Integer loan: zipcode.keySet()) {
            System.out.println("Bank name: " + loan + ", Type of loan: " + zipcode.get(loan));
        }

        // Iteration using forEach and lambda
        zipcode.forEach((employee, salary) -> {
            System.out.println(employee + " => " + salary);
        });

        // Iteration using entrySet().forEach and lambda
        // Similar to above but using entry instead of (employee, salary)
        zipcode.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        // Iteration using keySet().forEach and lambda
        // Similar to above but using key instead of (employee, salary)
        zipcode.keySet().forEach(zip -> {
            System.out.println(zip + " => " + zipcode.get(zip));
        });

        // Iteration using Iterator
        Iterator itr = zipcode.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Create iterator of keys
        // Use while loop to loop through iterator
        // To get value, we still need to access the Hashmap
        Iterator iterator = zipcode.keySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println("Cities: " + zipcode.get(iterator.next()));
        }

        // for loop over entry set
        for(Map.Entry<Integer, String> entry: zipcode.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Defined object
        // Employee class defined below
        Map<Integer, Employee> employeesMap = new HashMap<>();

        Employee employee1 = new Employee(1001, "Rajeev", "Bengaluru");
        Employee employee2 = new Employee(1002, "David", "New York");
        Employee employee3 = new Employee(1003, "Jack", "Paris");

        employeesMap.put(1001, employee1);
        employeesMap.put(1002, employee2);
        employeesMap.put(1003, employee3);

        System.out.println(employeesMap);
    }
}

class Employee {
    private Integer id;
    private String name;
    private String city;

    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
