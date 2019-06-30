package practiceProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Read more: http://www.java67.com/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html#ixzz5pNF5Tpvh

public class String_PrintDuplicateChars {
		

	/* * Find all duplicate characters in a String and print each of them. */
	public static void printDuplicateCharacters(String str) { 
		
		char[] characters = str.toCharArray(); 
		
		// build HashMap with character and number of times they appear in String 
		Map<Character, Integer> charMap = new HashMap<Character, Integer>(); 
		
		for (Character ch : characters) { 
			if (charMap.containsKey(ch)) { 
				charMap.put(ch, charMap.get(ch) + 1); 
			} else { 
				charMap.put(ch, 1); 
			} 
		} 
		
		// Iterate through HashMap to print all duplicate characters of String 
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet(); 
		
		System.out.printf("List of duplicate characters in String '%s' %n", str); 
		
		for (Map.Entry<Character, Integer> entry : entrySet) { 
			if (entry.getValue() > 1) { 
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue()); 
			} 
		} 
	} 
	
	public static void main(String args[]) { 
		
		printDuplicateCharacters("Programming"); 
		printDuplicateCharacters("Combination"); 
		printDuplicateCharacters("Java"); 
	} 
}




