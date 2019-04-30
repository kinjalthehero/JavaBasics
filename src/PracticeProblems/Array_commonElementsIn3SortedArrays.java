package PracticeProblems;

public class Array_commonElementsIn3SortedArrays {
	
    void findCommonIn3SrotedArrays(int ar1[], int ar2[], int ar3[]) 
    { 
        // Initialize starting indexes for ar1[], ar2[] and ar3[] 
        int i = 0, j = 0, k = 0; 
  
        // Iterate through three arrays while all arrays have elements 
        while (i < ar1.length && j < ar2.length && k < ar3.length) 
        { 
             // If x = y and y = z, print any of them and move ahead 
             // in all arrays 
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {   
            	 System.out.print(ar1[i]+" ");   
            	 i++; 
            	 j++; 
            	 k++; 
            } 
  
             // x < y 
             else if (ar1[i] < ar2[j]) 
                 i++; 
  
             // y < z 
             else if (ar2[j] < ar3[k]) 
                 j++; 
  
             // We reach here when x > y and z < y, i.e., z is smallest 
             else
                 k++; 
        } 
    } 
  
    public static void main(String args[]) 
    { 
    	Array_commonElementsIn3SortedArrays ob = new Array_commonElementsIn3SortedArrays(); 
  
        int ar1[] = {1, 5, 10, 20, 40, 80}; 
        int ar2[] = {6, 7, 20, 80, 100}; 
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
  
        System.out.print("Common elements are "); 
        ob.findCommonIn3SrotedArrays(ar1, ar2, ar3); 
        
        System.out.println();
        
        int [] A = {1,2,3,4,5,6,7,8,9,10};
		int [] B = {1,3,5,6,7,8,12};
		int [] C = {2,3,4,5,8,9};
		
		System.out.print("Common Elements are : ");
		ob.findCommonIn3SrotedArrays(A, B, C);
    } 
} 
