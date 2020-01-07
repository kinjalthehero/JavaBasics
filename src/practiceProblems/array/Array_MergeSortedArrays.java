package practiceProblems.array;

// Reference: https://www.geeksforgeeks.org/merge-two-sorted-arrays/ 

public class Array_MergeSortedArrays { 

	public static void mergeArrays(int[] arr1, int[] arr2, int arr1_len, int arr2_len, int[] arr3) { 
	     
		int i = 0, j = 0, k = 0; 
	   
	    while (i<arr1_len && j <arr2_len) { 
	    	if (arr1[i] < arr2[j]) 
	    		arr3[k++] = arr1[i++]; 
	    	else
	    		arr3[k++] = arr2[j++]; 
	    } 
	   
	    // Store remaining elements of first array 
	    while (i < arr1_len) 
	    	arr3[k++] = arr1[i++]; 
	   
	    // Store remaining elements of second array 
	    while (j < arr2_len) 
	    	arr3[k++] = arr2[j++]; 
	 }

	public static void merge_orig(int[] nums1, int m, int[] nums2, int n) {

		int elementsInNums1 = m-1;
		int nums1Length = nums1.length-1;
		int nums2Length = nums2.length-1;

		while(elementsInNums1 >= 0 && nums2Length >= 0) {
			if (nums1[elementsInNums1] > nums2[nums2Length])
				nums1[nums1Length--] = nums1[elementsInNums1--];
			else
				nums1[nums1Length--] = nums2[nums2Length--];
		}

		while (elementsInNums1 >= 0){
			nums1[nums1Length--] = nums1[elementsInNums1--];
		}

		while (nums2Length >= 0) {
			nums1[nums1Length--] = nums2[nums2Length--];
		}
	}
   
 public static void main (String[] args)  
 { 
     int[] arr1 = {1, 3, 5, 7}; 
     int n1 = arr1.length; 
   
     int[] arr2 = {2, 4, 6, 8}; 
     int n2 = arr2.length; 
   
     int[] arr3 = new int[n1+n2]; 
       
     mergeArrays(arr1, arr2, n1, n2, arr3); 
   
     System.out.println("Array after merging"); 
     for (int i=0; i < n1+n2; i++) 
         System.out.print(arr3[i] + " ");

	 int[] arr4 = {1, 3, 5, 7, 0, 0, 0, 0};
	 n1 = arr4.length;

	 int[] arr5 = {2, 4, 6, 8};
	 n2 = arr5.length;

	 merge(arr4, 4, arr5, n2);

	 System.out.println();

	 System.out.println("Array after merging");
	 for (int i=0; i < n1; i++)
		 System.out.print(arr3[i] + " ");

 }

	static void merge (int[] arr1, int len1, int[] arr2, int len2) {

		int i=len1-1, j = len2-1;
		int length = arr1.length-1;

		while(j >= 0) {

			if (arr1[i] > arr2[j])
				arr1[length--] = arr1[i--];
			else
				arr1[length--] = arr2[j--];
		}
	}
} 