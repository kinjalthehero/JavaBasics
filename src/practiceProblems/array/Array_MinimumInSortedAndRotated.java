package practiceProblems.array;

public class Array_MinimumInSortedAndRotated {

    public static int findMinimumElementRotatedSortedArray(int[] arr, int number)
    {
        int mid;
        int low = 0;
        int high = arr.length - 1;

        while(low < high)
        {
            mid = low + ((high - low) / 2);

            if(arr[mid] > arr[high])
            {
                low = mid+1;
            }
            else
            {
                high = mid;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {
        int arr[]={16,19,21,25,3,5,8,10};
        System.out.println("Minimum element in the array : "+findMinimumElementRotatedSortedArray(arr,5));
    }
}