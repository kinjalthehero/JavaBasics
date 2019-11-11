package practiceProblems.array;

import java.util.Arrays;

public class Array_L_MoveZeros {

    public static void moveZero(int[] arr) {

        int slow = 0, fast = 0;

        while (slow < arr.length && fast < arr.length) {

            if (arr[fast] == 0)
                fast++;
            else {
                arr[slow] = arr[fast];
                slow++;
                arr[fast] = 0;
            }
        }
    }

    public static void main (String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {0,0,0,0,1,2,0,0,0,3,12};
        moveZero(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr4 = {0,0,0};
        moveZero(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
