package practiceProblems.array;

public class Array_MinimumInSortedAndRotated {

    public static int findMinimumElementRotatedSortedArray(int[] arr)
    {
        int mid;
        int low = 0;
        int high = arr.length - 1;

        while(low < high)
        {
            //System.out.println("Low: " + arr[low] + " High: " + arr[high]);
            mid = low + ((high - low) / 2);
            //System.out.println("Mid: " + arr[mid]);

            if(arr[mid] > arr[high])
                low = mid+1;
            else
                high = mid;

        }

        return arr[low];
    }

    public static int findMin(int[] nums) {

        int left = 0, right = nums.length-1;

        while (left < right) {

            int mid = left + (right-left)/2;

            if (nums[mid] > nums[right])
                left = mid+1;
            else
                right = mid;
        }

        return left;

    }

    public static void main(String[] args) {
        int arr[]={10,16,19,21,25,3,5,8,};
        System.out.println("Minimum element in the array : "+findMinimumElementRotatedSortedArray(arr));

        int arr2[]={10,16,19,1,2,3,4,5,6,7,8,9};
        System.out.println("Minimum element in the array : "+findMinimumElementRotatedSortedArray(arr2));

        int arr3[]={10,16,3,5,8,};
        System.out.println("Minimum element in the array : "+findMinimumElementRotatedSortedArray(arr3));

        int arr4[]={10,12,16,3,5,8,};
        System.out.println("Minimum element in the array : "+findMinimumElementRotatedSortedArray(arr4));

        int arr5[]={3,5,8,9,10,11};
        System.out.println("Minimum element in the array : "+findMinimumElementRotatedSortedArray(arr5));

        int arr6[]={3,4,5,1,2};
        System.out.println("Minimum element in the array : "+findMin(arr6));
    }
}