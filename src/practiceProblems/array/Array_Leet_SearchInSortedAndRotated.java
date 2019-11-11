package practiceProblems.array;

public class Array_Leet_SearchInSortedAndRotated {

    // Sorting part is difficult to understand
    // Review this later
    public  static  int findElementRotatedSortedArray(int[] arr, int low, int high, int number)
    {
        int mid;

        while(low <= high)
        {
            mid = low + ((high - low) / 2);;

            if(arr[mid]==number)
                return mid;

            // To check if right or left part is sorted. Right part is sorted.
            if(arr[mid] <= arr[high])
            {
                // If element is between mid and high then element is on the right side
                if(number > arr[mid] && number <=arr[high])
                    low = mid+1;
                else
                    high = mid-1; // If element is less than mid than it is on the left side
            }
            // left part is sorted
            else
            {
                // Left part is sorted
                if(arr[low]<=number && number < arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]={21,25,3,5,8,10,16,19};
        System.out.println("Index of element 16 : "+findElementRotatedSortedArray(arr,0,arr.length-1,16));
        System.out.println("Index of element 19 : "+findElementRotatedSortedArray(arr,0,arr.length-1,19));
        System.out.println("Index of element 21 : "+findElementRotatedSortedArray(arr,0,arr.length-1,21));
        System.out.println("Index of element 25 : "+findElementRotatedSortedArray(arr,0,arr.length-1,25));
        System.out.println("Index of element 3 : "+findElementRotatedSortedArray(arr,0,arr.length-1,3));
        System.out.println("Index of element 5 : "+findElementRotatedSortedArray(arr,0,arr.length-1,5));
        System.out.println("Index of element 8 : "+findElementRotatedSortedArray(arr,0,arr.length-1,8));
        System.out.println("Index of element 10 : "+findElementRotatedSortedArray(arr,0,arr.length-1,10));
        System.out.println("Index of element 99 : "+findElementRotatedSortedArray(arr,0,arr.length-1,99));
    }
}