package practiceProblems;

import java.util.Arrays;

// Reference: http://www.java67.com/2014/02/how-to-find-largest-and-smallest-number-array-in-java.html

public class Array_LargestElement {

	public static void printLargestAndSmallestElements (int[] arr) {
		
		int largestElement = arr[0];
		int smallestElement = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largestElement)
				largestElement = arr[i];
			else if (arr[i] < smallestElement)
				smallestElement = arr[i];
		}
		
		System.out.println("Largest element: " + largestElement);
		System.out.println("Smallest element: " + smallestElement);
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		printLargestAndSmallestElements(arr);
		System.out.println();
		
		int[] arr1 = {1,1,1,1,1};
		System.out.println(Arrays.toString(arr1));
		printLargestAndSmallestElements(arr1);
		System.out.println();
		
		int[] arr2 = {6,1,1,1};
		System.out.println(Arrays.toString(arr2));
		printLargestAndSmallestElements(arr2);
		System.out.println();
		
		int[] arr3 = {6,5,4,3,2,1};
		System.out.println(Arrays.toString(arr3));
		printLargestAndSmallestElements(arr3);
		
	}

}
