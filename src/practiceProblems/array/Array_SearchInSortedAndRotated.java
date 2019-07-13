package practiceProblems.array;

public class Array_SearchInSortedAndRotated {

    // Sorting part is difficult to understand
    // Review this later
    public  static  int findElementRotatedSortedArray(int[] arr, int low, int high, int number)
    {
        int mid;

        while(low <= high)
        {
            // We are dividing the arraay into halves to search
            // That is why complexity is O(log n)
            mid = low + ((high - low) / 2);;

            if(arr[mid]==number)
            {
                return mid;
            }

            // To check if right or left part is sorted
            // Right part is sorted
            if(arr[mid] <= arr[high])
            {
                // If element is between mid and high then element is on the right side
                if(number > arr[mid] && number <=arr[high])
                {
                    low = mid+1;
                }
                // If element is less than mid than it is on the left side
                else
                {
                    high = mid-1;
                }
            }
            // left part is sorted
            else
            {
                // Left part is sorted
                if(arr[low]<=number && number < arr[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]={16,19,21,25,3,5,8,10};
        System.out.println("Index of element 5 : "+findElementRotatedSortedArray(arr,0,arr.length-1,5));
    }
}