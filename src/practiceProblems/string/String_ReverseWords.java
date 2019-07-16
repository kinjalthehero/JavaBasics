package practiceProblems.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_ReverseWords {
	
	// String builder
	public static String reverseString(String line) {
		
		if (line.trim().isEmpty()) 
			return line;
	 
		StringBuilder reverse = new StringBuilder();
		String[] sa = line.trim().split("\\s");
	
		for (int i = sa.length - 1; i >= 0; i--) {
		  reverse.append(sa[i]);
		  reverse.append(' ');
		}
		 
		return reverse.toString().trim();
	}
	 
	// String builder
	public static String reverseString_forLoop(String sentence) {
		  
		// \s (lower case), which is a regular expression character class for white space
		// Split them in the words from white space
		List< String> words = Arrays.asList(sentence.split("\\s"));
		
		StringBuilder sb = new StringBuilder(sentence.length());

		for (int i = words.size() - 1; i >= 0; i--) {
			sb.append(words.get(i));
			sb.append(' ');
		}
	 
		return sb.toString().trim();
	}
	
	// String builder
	public static String reverseString_collection(String sentence) {
		  
		// \s (lower case), which is a regular expression character class for white space
		// Split them in the words from white space
		List< String> words = Arrays.asList(sentence.split("\\s"));
		Collections.reverse(words);
		
		StringBuilder sb = new StringBuilder(sentence.length());

		for (int i = 0; i <= words.size() - 1; i++) {
			sb.append(words.get(i));
			sb.append(' ');
		}
	 
		return sb.toString().trim();
	}
	
	public static void main (String[] args) {
		
		// StringBuffer
	    String word = "I love coding";
	    String reverse = reverseString(word);
	    System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
	    
	    // StringBuffer
	    word = "I am reversing reverseString_forLoop";
	    reverse = reverseString_forLoop(word);
	    System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
	    
	    // StringBuffer
	    word = "I am reversing reverseString_collection";
	    reverse = reverseString_collection(word);
	    System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
		
	}
}
