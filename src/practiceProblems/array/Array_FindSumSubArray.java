package practiceProblems.array;

public class Array_FindSumSubArray {

    public static void main(String[] args) {

        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23, 10, 23, 5, 2 };

        kinjalSimpleMethod(arr, 33);
        System.out.println("======================");
        int arr2[] = {1,2,3,4,5,6};
        kinjalSimpleMethod(arr2, 33);
        int[] arr3 = {14, 12, 70, 15, 99, 65, 21, 90};
        kinjalSimpleMethod(arr3, 97);

    }

    static void kinjalSimpleMethod(int arr[], int sum)
    {
        int currentSum = 0;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++)
        {
            // Everytime we consider a new subarray, make currentSum = 0
            currentSum = 0;
            int startOftheSubArray = i;

            // Staring from i, consider all elements and check if its sum is equal to expected sum
            while (currentSum <= sum && startOftheSubArray < arr.length)
            {
                // sum found. Now print indices and elements
                if (currentSum == sum)
                {
                    int endIndexForContArray = startOftheSubArray-1;
                    System.out.println("Kinjal Sum found between indexes " + i + " and " + endIndexForContArray);

                    for (int k = i; k <= endIndexForContArray; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                    flag = false;
                }

                currentSum = currentSum + arr[startOftheSubArray];
                startOftheSubArray++;
            }

            if (flag && i == arr.length-1) {
                System.out.println("No subarray found");
                return;
            }
        }
    }
}
