package practiceProblems.array;

import java.util.*;

public class Array_Intersection {
	
	

	public int intersection(int[] arrA, int[] arrB) {
		
		int intersectionPoint = -1;
		int arrayALength = 0;
		int arrayBLength = 0;
		
		while (arrayALength < arrA.length && arrayBLength < arrB.length) {
			
			if (arrA[arrayALength] > arrB[arrayBLength])
				arrayBLength++;
			else if (arrA[arrayALength] < arrB[arrayBLength])
				arrayALength++;
			else {
				intersectionPoint = arrA[arrayALength];
				return intersectionPoint;
			}
		}
		
		return intersectionPoint;
	}

	public static void main(String[] args) throws java.lang.Exception {
		int[] a = { 1, 2, 3, 6, 8, 10 };
		int[] b = { 4, 5, 6, 11, 15, 20 };
		Array_Intersection i = new Array_Intersection();
		System.out.println("Intersection point is : " + i.intersection(a, b));
		System.out.println("Kinjal point is : " + common(a, b));

		int[] c = {4,9,5};
		int[] d = {8,10, 20};
		System.out.println("Kinjal point is : " + common(c, d));

	}

	static int common (int[] arr1, int[] arr2) {

		int left = 0, right = 0;

		while(left < arr1.length-1 && right < arr2.length-1) {

			if (arr1[left] == arr2[right])
				return arr1[left];
			else if (arr1[left] < arr2[right])
				left++;
			else
				right++;
		}

		throw new RuntimeException ("No common element");
	}

	static List<Integer> intersection_arr (int[] arr1, int[] arr2) {


		Set<Integer> set = new HashSet<>();
		Set<Integer> output = new HashSet<>();

		for (int a: arr1) {
			set.add(a);
		}

		for (int b: arr2) {

			if (!set.add(b))
				output.add(b);
		}

		return new ArrayList<>(output);
	}
}

