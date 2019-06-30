package practiceProblems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Array_uniqueElement {

	/*
	 * Time complexity
	 * Sort = O(n log n)
	 * Traverse array - n
	 * Complexity = O(n log n)
	 */
	public static int findUniqueElement (int[] arr) {
		
		Arrays.sort(arr);
		
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != arr[i+1])
				return arr[i];
			i = i+2;
		}
		return -1;		
	}
	
    public static void findUsingHashMap(int [] a){
        
    	
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	// Add array into hashmap
    	// Key = Array element
    	// Value = Number of occurrence 
        for (int i = 0; i <a.length ; i++) {
            if(map.containsKey(a[i])) {
                int count = map.get(a[i]);
                map.put(a[i],++count);
            }else
                map.put(a[i],1);
        }
        
        // Iterate through hashmap
        // Get key with value 1
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        
        while (iterator.hasNext()){
            int key = iterator.next();
            if(map.get(key)==1){
                System.out.println("Element appear only once in array - " + key);
            }
        }
    }
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 5, 4, 2, 1};
		System.out.println(findUniqueElement(arr));
		findUsingHashMap(arr);

	}

}
