package practiceProblems.array;

public class Array_SecondLargestElement {

    public static int findSecondLargestNumberInTheArray(int array[])
    {
        // Initialize these to the smallest value possible
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Loop over the array
        for (int i = 0; i < array.length; i++)
        {
            // If current element is greater than highest
            if (array[i] > highest)
            {
                // assign second highest element to highest element
                secondHighest = highest;

                // highest element to current element
                highest = array[i];
            }
            else if (array[i] > secondHighest)
            {
                secondHighest = array[i];
            }
        }

        return secondHighest;
    }

    static int secondLargest (int[] arr) {

        if (arr.length == 0 || arr.length == 1)
            throw new RuntimeException("Need 2 or more elements in the array");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int a: arr) {

            if (a > largest) {
                secondLargest = largest;
                largest = a;

            }
            else if (a > secondLargest)
                secondLargest = a;
        }

        return secondLargest;
    }

    public static void main(String args[])
    {
        int[] arr1={7,5,6,1,4,2};
        int secondHighest=findSecondLargestNumberInTheArray(arr1);
        System.out.println("Second largest element in the array : "+ secondHighest);
        System.out.println(secondLargest(arr1));
    }
}