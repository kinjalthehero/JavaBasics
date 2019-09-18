package practiceProblems.string;

import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.HashSet; 
import java.util.LinkedHashMap; 
import java.util.List; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.Set;

/*
 * Reference: https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html
 */

public class String_FirstNonRepeatedChar {

	/*
	 *  Method 1 - LinkedHashMap
 	 * Get character array from given String
	 * Build a hash table 
	 * Character as key and their count as value
	 * In next step, It loop through LinkedHashMap to find an entry with value 1
	 * because LinkedHashMap maintains insertion order  
	 */
	public static char getFirstNonRepeatedChar(String str) {
	    Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
	    
	    for (char c : str.toCharArray()) {
	        counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
	    }
	    
	    for (Entry<Character,Integer> entry : counts.entrySet()) {
	        if (entry.getValue() == 1) {
	            return entry.getKey();
	        }
	    }
	    
	    System.out.println(("didn't find any non repeated Character"));
	    return '\0';
	}
	
	/*
	 * Method 2 - Using 2 storage
	 * Finds in just one pass 
	 * Applies classical space-time trade-off technique
	 * Uses two storage to cut down one iteration
	 * Stores repeated (Set) and non-repeated (List) characters separately
	 * First element from List is first non repeated character
	 * It's your choice to return null or empty string if there is no non-repeated character in the String
	 */
	public static char firstNonRepeatingChar(String word) {
	    
		// No duplicates, Unordered
		Set<Character> repeating = new HashSet<>();
	    
		// Duplicates, ordered
		List<Character> nonRepeating = new ArrayList<>();
	    
		for (int i = 0; i < word.length(); i++) {
	        
			char letter = word.charAt(i);
	        
			// If repeated char then skip
			if (repeating.contains(letter)) {
	            continue;
	        }
	        
			// If char is part of non-repeated list 
			// then remove from non-repeated list and add in repeating set
			// Otherwise add it to non-repeated list
			if (nonRepeating.contains(letter)) {
	            nonRepeating.remove((Character) letter);
	            repeating.add(letter);
	        } else {
	            nonRepeating.add(letter);
	        }
	    }
		
		// List - Ordered so get first char
		if (nonRepeating.isEmpty()) {
			System.out.println("didn't find any non repeated Character");
			return '\0';
		}
		else
			return nonRepeating.get(0);
	}
	
	/* 
	 * Method 3 - Using HashMap
	 * Similar to first one 
	 * Instead of LinkedHashMap use HashMap
	 * First step : Scan String and store count of each character in HashMap
	 * Second Step : traverse String and get count for each character from Map
	 * Since we are going through String from first to last character
     * when count for any character is 1, we break, it's the first non repeated character
	 */
	public static char firstNonRepeatedCharacter(String word) {
	    
	    HashMap<Character,Integer> scoreboard = new HashMap<>();
	    
	    // build table [char -> count]
	    for (int i = 0; i < word.length(); i++) {
	        
	        char c = word.charAt(i);
	        
	        if (scoreboard.containsKey(c)) {
	            scoreboard.put(c, scoreboard.get(c) + 1);
	        } else {
	            scoreboard.put(c, 1);
	        }
	    }
	    
	    // since HashMap doesn't maintain order, going through string again
	    for (int i = 0; i < word.length(); i++) {
	        char c = word.charAt(i);
	        if (scoreboard.get(c) == 1) {
	            return c;
	        }
	    }
	    
	    System.out.println(("didn't find any non repeated Character"));
	    return '\0';
	}

	public static int firstUniqChar(String s) {

		for (int i = 0; i < s.length(); i++)
		{
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
				return i;
		}

		return -1;

	}
	
	public static void main(String[] args) {
		
		String str = "swiss";
		System.out.println(getFirstNonRepeatedChar(str));
		System.out.println(firstNonRepeatingChar(str));
		System.out.println(firstNonRepeatedCharacter(str));
		System.out.println(firstUniqChar(str));
		
		str = "abcde";
		System.out.println(getFirstNonRepeatedChar(str));
		System.out.println(firstNonRepeatingChar(str));
		System.out.println(firstNonRepeatedCharacter(str));
		System.out.println(firstUniqChar(str));
		
		str = "aaaaa";
		System.out.println(getFirstNonRepeatedChar(str));
		System.out.println(firstNonRepeatingChar(str));
		System.out.println(firstNonRepeatedCharacter(str));
		System.out.println(firstUniqChar(str));
		
		str = "";
		System.out.println(getFirstNonRepeatedChar(str));
		System.out.println(firstNonRepeatingChar(str));
		System.out.println(firstNonRepeatedCharacter(str));
		System.out.println(firstUniqChar(str));

	}

}
