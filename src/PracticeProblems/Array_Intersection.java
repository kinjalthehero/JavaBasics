package PracticeProblems;

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

	}
}

