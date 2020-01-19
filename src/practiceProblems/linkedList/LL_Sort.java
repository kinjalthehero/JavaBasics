package practiceProblems.linkedList;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;

public class LL_Sort{

	public static void main(String args[]) {
	
		// Creating and initializing an LL_BasicOperations for sorting
		LinkedList<String> singlyLinkedList = new LinkedList<>();
		singlyLinkedList.add("Eclipse");
		singlyLinkedList.add("NetBeans");
		singlyLinkedList.add("IntelliJ");
		singlyLinkedList.add("Resharper");
		singlyLinkedList.add("Visual Studio");
		singlyLinkedList.add("notepad");
		
		System.out.println("LL_BasicOperations (before sorting): " + singlyLinkedList);
		
		// Example 1 - Sorting LL_BasicOperations with Collecitons.sort() method in natural order
		Collections.sort(singlyLinkedList);
		
		System.out.println("LL_BasicOperations (after sorting in natural): " + singlyLinkedList);
		
		// Example 2 - Sorting LL_BasicOperations using Collection.sort() and Comparator in Java
		Collections.sort(singlyLinkedList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			} 
		});
	
		System.out.println("LL_BasicOperations (after sorting using Comparator): " + singlyLinkedList);
	}
}