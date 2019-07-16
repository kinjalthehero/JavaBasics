package practiceProblems.string;

//Read more: http://www.java67.com/2012/12/how-to-reverse-string-in-java-stringbuffer-stringbuilder.html#ixzz5pN7HgOuD

public class String_Reverse {

	// Using loop
	public static String reverseString(String str){
	    if (str == null || str.isEmpty())
	        return str;
	    
	    String reverse = "";
	    
	    for(int i = str.length() -1; i >= 0; i--) 
	        reverse = reverse + str.charAt(i);
	  
	    return reverse;
	}

	// Using recursionß
	public String recursiveReverse(String str)
	{
		if(str.length() == 1)
			return str;
		else
			return str.charAt(str.length() - 1) + recursiveReverse(str.substring(0, str.length() - 1));
	}

	// Reverse in place
	public static String inPlaceReverse(String input) {

		StringBuilder builder = new StringBuilder(input);
		int length = builder.length();

		for (int i = 0; i < length / 2; i++) {

			char current = builder.charAt(i);
			int otherEnd = length - i - 1;
			builder.setCharAt(i, builder.charAt(otherEnd)); // swap
			builder.setCharAt(otherEnd, current);
		}

		return builder.toString();
	}

	public static void main(String args[]) {
	      
	    // StringBuffer
	    String word = "HelloWorld";
	    String reverse = new StringBuffer(word).reverse().toString();
	    System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
	    reverse =
	  
	    // StringBuilder
	    word = "WakeUp";
	    reverse = new StringBuilder(word).reverse().toString();
	    System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
	  
	    // Local method
	    word = "Band";
	    reverse = reverseString(word);
	    System.out.printf(" original String : %s , reversed String %s %n", word, reverse);

		// In place
		word = "Band";
		reverse = inPlaceReverse(word);
		System.out.printf(" original String : %s , reversed String %s %n", word, reverse);

	}   
}
