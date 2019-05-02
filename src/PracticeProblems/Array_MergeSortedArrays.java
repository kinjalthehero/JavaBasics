package PracticeProblems;

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
 } 
} 