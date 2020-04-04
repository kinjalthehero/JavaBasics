package practiceProblems.array;

class Array_PartitionDifference {

    public static int findMin(int arr[]) {

        int sumTotal = 0;

        for (int i = 0; i < arr.length; i++)
            sumTotal += arr[i];

        return findMinRec(arr, arr.length, 0, sumTotal);
    }

    public static int findMinRec(int arr[], int i, int sumCalculated, int sumTotal) {

        // If we have reached last element.
        // sum of one subset is sumCalculated. sum of other subset is sumTotal-sumCalculated.
        // Return absolute difference of two sums.
        if (i == 0)
            return Math.abs((sumTotal - sumCalculated) - sumCalculated);

        // For every item arr[i], we have two choices
        // (1) We do not include it in the first set
        // (2) We include it in the first set
        // We return minimum of two choices
        return Math.min(findMinRec(arr, i-1, sumCalculated + arr[i-1], sumTotal),
                        findMinRec(arr, i-1, sumCalculated, sumTotal));
    }

    public static void main(String[] args) {

        int arr[] = {3, 1, 4, 2, 2, 1};
        System.out.print("The minimum difference between two sets is " + findMin(arr));
    }
}

