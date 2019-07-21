package dataStructure.array;

public class Basics {

    public static void main(String[] args) {

    	// Method 1
        int[] rollNumbers = new int[5];
        // Method 2
        int arr[] = {10, 20, 30, 40, 50};

        rollNumbers[0] = 1;
        rollNumbers[1] = 2;
        rollNumbers[2] = 3;
        rollNumbers[3] = 4;
        rollNumbers[4] = 5;

        for (int i=0; i < rollNumbers.length; i++) {
            System.out.println("Value at the index " + i + " is: " + rollNumbers[i]);
        }
        
        for (int val: arr){
            System.out.println(val);
        }

        Student[] students = new Student[5];
        students[0] = new Student(1, "Kinjal");
        students[1] = new Student(2, "Jignesh");
        students[2] = new Student(3, "Yamini");
        students[3] = new Student(4, "Mehul");
        students[4] = new Student(5, "Amisha");

        for (Student student: students) {
            System.out.println("Student roll: " + student.rollNumber + " Name: " + student.name);
        }

        // [row][column]
        int[][] multidimentionalArray = new int[2][4];
        multidimentionalArray[0][0] = 1;
        multidimentionalArray[0][1] = 2;

        multidimentionalArray[0][2] = 3;
        multidimentionalArray[0][3] = 4;

        multidimentionalArray[1][0] = 5;
        multidimentionalArray[1][1] = 6;

        multidimentionalArray[1][2] = 7;
        multidimentionalArray[1][3] = 8;

        for (int i=0; i < 2; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(multidimentionalArray[i][j]);
            System.out.println();
        }

        int[][] multiArray = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i=0; i < 2; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(multiArray[i][j]);
            System.out.println();
        }

        // Array pass by referecne
        int[] arrayForMethodCall = {10, 20, 30, 40, 50};
        Basics.addOneinArray(arrayForMethodCall);

        for (int elements: arrayForMethodCall)
            System.out.println("Array after method call: " + elements);

    }

    static void addOneinArray(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

}
