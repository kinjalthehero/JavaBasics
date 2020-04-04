package practiceProblems.array;

public class Array_SmallestDivisor {

    public static int smallestDivisor(int[] arr, int threshold) {

        int left = 1, right = 1000000;

        while (left < right) {

            int mid = left + (right - left)/ 2;
            int sum = 0;

            for (int i : arr) {
                sum += Math.ceil(((double)i) / mid);
            }

            if (sum > threshold)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        // 5
        int[] arr = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(arr, threshold));

        // 3
        int[] arr2 = {2,3,5,7,11};
        int threshold2 = 11;
        System.out.println(smallestDivisor(arr2, threshold2));

        //4
        int[] arr3 = {19};
        int threshold3 = 5;
        System.out.println(smallestDivisor(arr3, threshold3));
    }
}
