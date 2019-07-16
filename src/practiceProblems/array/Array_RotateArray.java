package practiceProblems.array;

public class Array_RotateArray {

    // Brute force approach
    // Time complexity: o(n*k)
    // Where n is number of elements and k denotes position shift
    // Space complexity: o(1)
    public static int[] rotateBruteForce(int[] nums, int shiftBy) {

        int arrLength=nums.length;

        // if shiftBy number is greater than find the mod value and shift by that value
        if(shiftBy > arrLength)
            shiftBy = shiftBy % arrLength;

        for (int i = 0; i < shiftBy; i++) {
            for (int j = arrLength - 1; j > 0; j--) {

                // This will move last element to first and every other elements to the right by 1
                // This will be done siftBy number of times
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
            System.out.println("Array rotation after "+(i+1)+" step");
            printArray(nums);
            System.out.println();
        }
        return nums;
    }

    // Time complexity: o(n)
    // Space complexity: o(n)
    public static int[] rotateExtraSpace(int[] arr, int shiftBy)
    {
        int arrlength = arr.length;

        if (shiftBy > arrlength)
            shiftBy = shiftBy % arrlength;

        int[] result = new int[arrlength];

        // Copy last shiftBy number of elements at the start of the result array
        for(int i=0; i < shiftBy; i++)
        {
            // this logic is important to rememeber
            result[i] = arr[arrlength - shiftBy + i];
        }

        int index=0;

        // Copy remaining elements in the result array
        for(int i=shiftBy; i<arrlength; i++){
            result[i] = arr[index];
            index++;
        }

        return result;
    }

    public static void printArray(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int nums[]={1,2,3,4,5,6,7,8};

        System.out.println("Rotate array by shifting one elements by 1 and do it k times");
        int[] result1=rotateBruteForce(nums,2);
        System.out.println("Final rotated array :");
        printArray(result1);
        System.out.println();
        System.out.println("================================");
        System.out.println("Rotate array using extra space");

        int nums2[]={10,20,30,40,50,60};
        int[] result2=rotateExtraSpace(nums2,5);
        printArray(result2);
        System.out.println();
        System.out.println("================================");
        System.out.println("Rotate array most optimized approach");
    }
}
