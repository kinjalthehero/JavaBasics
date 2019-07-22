package practiceProblems.linkedList;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;

public class LL_Sort{

	public static void main(String args[]) {
	
		// Creating and initializing an LinkedList_primitive for sorting
		LinkedList<String> singlyLinkedList = new LinkedList<>();
		singlyLinkedList.add("Eclipse");
		singlyLinkedList.add("NetBeans");
		singlyLinkedList.add("IntelliJ");
		singlyLinkedList.add("Resharper");
		singlyLinkedList.add("Visual Studio");
		singlyLinkedList.add("notepad");
		
		System.out.println("LinkedList_primitive (before sorting): " + singlyLinkedList);
		
		// Example 1 - Sorting LinkedList_primitive with Collecitons.sort() method in natural order
		Collections.sort(singlyLinkedList);
		
		System.out.println("LinkedList_primitive (after sorting in natural): " + singlyLinkedList);
		
		// Example 2 - Sorting LinkedList_primitive using Collection.sort() and Comparator in Java
		Collections.sort(singlyLinkedList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			} 
		});
	
		System.out.println("LinkedList_primitive (after sorting using Comparator): " + singlyLinkedList);
	}
}