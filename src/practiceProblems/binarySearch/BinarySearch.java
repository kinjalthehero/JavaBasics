package practiceProblems.binarySearch;

public class BinarySearch {

    boolean binarySearchRecursion (int[] arr, int element, int left, int right) {

        if (left > right)
            return false;

        int mid = left + ((right-left)/2);

        if (arr[mid] == element)
            return true;
        else if (element < arr[mid])
            binarySearchRecursion (arr, element, left, mid-1);
        else
            binarySearchRecursion (arr, element, mid + 1, right);

        return false;
    }

    public boolean binarySearchRec (int[] arr, int element) {
        return binarySearchRecursion(arr, element, 0, arr.length);
    }

    public boolean binarySearchIterative (int[] arr, int element) {

        int left = 0;
        int right = arr.length;

        while (left <= right)
        {
            int mid = left + ((right - left) / 2);

            if (arr[mid] == element)
                return true;
            else if (element < arr[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }

        return false;
    }

}
