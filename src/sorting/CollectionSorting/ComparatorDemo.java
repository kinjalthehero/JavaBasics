package sorting.CollectionSorting;

import java.util.*;

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorDemo {

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

        // Sorting in ascending order
        System.out.println("Ascending order");
        Collections.sort(list, (l1, l2) -> l1.rollNumber > l2.rollNumber? 1 : -1);
        System.out.println(list);
        System.out.println();

        // Sorting in descending order
        System.out.println("Descending order");
        Collections.sort(list, (l1, l2) -> l1.rollNumber > l2.rollNumber? -1 : 1);
        System.out.println(list);
        System.out.println();

        // Sort by roll number
        System.out.println("Ascending order using comparingInt method");
        Collections.sort(list, Comparator.comparingInt(s -> s.rollNumber));
        System.out.println(list);
        System.out.println();

        System.out.println("Sorting by first name");
        Collections.sort(list, Comparator.comparing(student -> student.name));
        System.out.println(list);
        System.out.println();

        System.out.println("Soring in reverse order");
        List<Integer> nums = Arrays.asList(999, 111, 666, 333, 888);
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);
        System.out.println();

        System.out.println("Sort first by roll number and then name");
        Collections.sort(list, (n1, n2) -> {
            if (n1.rollNumber == n2.rollNumber)
                return n1.name.compareTo(n2.name);
            else
                return n1.rollNumber - n2.rollNumber;
        });
        System.out.println(list);
        System.out.println();

        // Use Arrays.sort instead of Collections.sort for primitive array
        int[] arr = new int[] {100, 500, 300, 200, 600, 900};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // Sorting based on 2nd element of 2D array
        int[][] arr2 = new int[][] {{100,1}, {500, 9}, {300, 6}, {200, 8}, {600, 2}, {900,3}};
        Arrays.sort(arr2, Comparator.comparingInt(a -> a[1]));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println();

        // Sorting based on 2nd element of 2D array
        int[][] arr3 = new int[][] {{100,1}, {500, 9}, {300, 6}, {200, 8}, {600, 2}, {900,3}};
        Arrays.sort(arr3, (a,b) -> {return a[1]-b[1];});
        System.out.println(Arrays.deepToString(arr3));
        System.out.println();
    }
}


