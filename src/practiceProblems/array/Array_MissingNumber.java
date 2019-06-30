package practiceProblems.array;

public class Array_MissingNumber {

	public static int missingNumber (int[] arr, int numberOfElements) {
		
		int expectedSum = (numberOfElements * (numberOfElements + 1)) / 2;
		
		int actualSum = 0;
		
		for (int num: arr) {
			actualSum += num; 
		}
			
		return expectedSum - actualSum;
	}
	
	
	public static void main(String[] args) {
		
		int[] sampleArray = new int[] {1,2,4,5,6};
		System.out.println(missingNumber(sampleArray, 6));
		
		sampleArray = new int[] {2,3,4,5,6,7,8};
		System.out.println(missingNumber(sampleArray, 8));
		
		sampleArray = new int[] {1, 2,3,4,5,6,7};
		System.out.println(missingNumber(sampleArray, 8));
	}

}
