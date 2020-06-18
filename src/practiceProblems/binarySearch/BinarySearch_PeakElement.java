package practiceProblems.binarySearch;

public class BinarySearch_PeakElement {

    public static int findPeakElement(int[] nums) {

        int left = 0, right = nums.length-1;

        while (left < right) {

            int mid = left + (right-left)/2;

            if (nums[mid] > nums[mid+1])
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    public static int peakIndexInMountainArray(int[] A) {

        int left = 0, right = A.length-1;

        while(left < right) {

            int mid = left + (right - left) / 2;

            if (A[mid] > A[mid+1])
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
        System.out.println(peakIndexInMountainArray(arr));

        int[] arr2 = {2,1};
        System.out.println(findPeakElement(arr2));
        System.out.println(peakIndexInMountainArray(arr2));

        int[] arr3 = {1,2,3,5,2,1};
        System.out.println(findPeakElement(arr3));
        System.out.println(peakIndexInMountainArray(arr3));
    }
}
