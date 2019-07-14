package practiceProblems.array;

public class Array_Separate0And1 {

    // Method 1: Count number of zeros and then add them in the array
    public static int[] separate0s1sSolution1(int arr[])
    {
        int count = 0;

        // Count number of zeros
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
        }

        // Insert those many zeros till count-1
        for (int i = 0; i < count; i++)
        {
            arr[i] = 0;
        }

        // From count to arr.length-1, insert 1s
        for (int i = count; i < arr.length; i++)
        {
            arr[i] = 1;
        }
        return arr;
    }

    public static int[] separate0s1sSolution2(int arr[])
    {
        int left = 0;
        int right = arr.length - 1;

        while (left < right)
        {
            // Increment 'left' variable until you get 1’s
            // left variable will be on 1
            while(arr[left] == 0)
            {
                left++;
            }

            // Decrement right variable until you get 0’s
            // right variable will be on 0
            while(arr[right] == 1)
            {
                right--;
            }

            // Will place 1 to the right side and 0 to the left side
            if(left < right)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int arr[]={0,0,0,1,0,1,0,1,1,1};
        System.out.println("Original Array: ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        arr=separate0s1sSolution1(arr);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int arr2[] = {0,0,0,1,1,1,0,1,0,1,0,1,0,1,1,1};
        arr2 = separate0s1sSolution2(arr2);

        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
