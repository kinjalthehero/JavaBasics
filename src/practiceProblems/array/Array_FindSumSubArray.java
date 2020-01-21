package practiceProblems.array;

public class Array_FindSumSubArray {

    public static void subarrayWithSumTarget(int[] arr, int target)
    {
        boolean flag = false;

        for (int i = 0; i < arr.length; i++)
        {
            // Everytime we consider a new subarray, make currentSum = 0
            int sum = 0;

            // Staring from i, consider all elements and check if its sum is equal to expected sum
            for (int j = i; j < arr.length; j++)
            {
                sum += arr[j];

                // sum found. Now print indices and elements
                if (sum == target)
                {
                    System.out.println("Subarray between " + i + " and " + j);
                    System.out.print("Elements are ");
                    for (int k = i; k <= j; k++)
                    {
                        System.out.print(arr[k] + " ");
                    }
                    flag = true;
                    System.out.println();
                }

                if (sum > target)
                    break;
            }
        }
        if (!flag)
            System.out.println("Not found");
    }

    public static void main(String[] args) {
        int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
        subarrayWithSumTarget(arr, 97);

        int[] arr2 = {14, 12, 70, 15, 99, 65, 21, 90, 12, 70, 15};
        subarrayWithSumTarget(arr2, 97);

        int[] arr3 = {14, 12, 72, 15, 99, 65, 21, 90, 12, 71, 15};
        subarrayWithSumTarget(arr3, 97);
    }


}
