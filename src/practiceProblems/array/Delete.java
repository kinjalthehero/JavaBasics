package practiceProblems.array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student {
    int rollNumber;
    String name;

    Student (int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Delete {

    static int window(int[] a, int d) {

        int sum = 0, max = Integer.MIN_VALUE;

        for (int i=0; i < d; i++) {
            sum += a[i];
        }

        for (int left=1; left < a.length-d; left++) {
            sum += a[left+d-1] - a[left-1];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {

        Student s1 = new Student(9, "Kinjal");
        Student s2 = new Student(1, "Jignesh");
        Student s3 = new Student(7, "Divyesh");
        Student s4 = new Student(10, "Purvesh");
        Student s5 = new Student(3, "Mehul");
        Student s6 = new Student(3, "Tejas");
        Student s7 = new Student(3, "Amisha");

        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
        list.forEach(student -> System.out.println("Student name " + student.name));
        System.out.println();

        /****** Sorting list of objects ******/

        // Method 1: Sorting in ascending order of Integer
        list.sort((l1, l2) -> (l1.rollNumber < l2.rollNumber) ? -1 : 1);
        // Method 2: Sorting in ascending order
        list.sort(Comparator.comparingInt(s -> s.rollNumber));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();

        // Method 1: Sorting in ascending order of String
        list.sort((l1, l2) -> (l1.name.compareTo(l2.name)));
        // Method 2: Sorting in ascending order of String
        list.sort(Comparator.comparing(s -> s.name));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();

        // Sorting in descending order
        list.sort((l1, l2) -> l1.rollNumber < l2.rollNumber? 1 : -1);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();

        // Sort first by roll number and then name
        list.sort((a,b) -> (a.rollNumber == b.rollNumber) ? (a.name.compareTo(b.name)) : (a.rollNumber < b.rollNumber) ? -1 : 1);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();

        // Sorting Integer List in reverse order
        List<Integer> nums = Arrays.asList(999, 111, 666, 333, 888);
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);
        System.out.println();

        /****** Sorting primitive array ******/
        // Use Arrays.sort for primitive array
        int[] arr = new int[] {100, 500, 300, 200, 600, 900};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[][] arr2 = new int[][] {{100,1}, {500, 9}, {300, 6}, {200, 8}, {600, 2}, {900,3}};
        // Sorting based on 2nd element of 2D array
        Arrays.sort(arr2, Comparator.comparingInt(a -> a[1]));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println();

        int[][] arr3 = new int[][] {{100,1}, {500, 9}, {300, 6}, {200, 8}, {600, 2}, {900,3}};
        // Sorting based on 2nd element of 2D array
        Arrays.sort(arr3, (a,b) -> (a[1] < b[1] ? -1 : 1));
        System.out.println(Arrays.deepToString(arr3));

        String str = "word1, word2 word3@word4?word5.word6";
        String[] output = str.split("[^a-zA-Z]+");
        System.out.println(Arrays.toString(output));
    }
}

class Human {
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
    int age;

    // standard constructors, getters/setters, equals and hashcode
}
