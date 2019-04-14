package Array;

public class Insertion {
	
	public static int[] insertAnElement (int[] arr, int num, int pos) {

		if (pos >= arr.length)
			System.out.println("Position is outside of the array");
		
		for (int i = arr.length-2; i >= pos; i--)
			arr[i+1] = arr[i];
		
		arr[pos] = num;
		
		return arr;
	}
	
	private static int[] deleteAnElement(int[] arr, int pos) {
		
		for (int i = pos; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[arr.length - 1] = 0;
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[7];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		insertAnElement(arr, 10, 3);
		
		System.out.println("After insertion");
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		deleteAnElement(arr, 3);
		
		System.out.println("After deletion");
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		
	}

	
}
