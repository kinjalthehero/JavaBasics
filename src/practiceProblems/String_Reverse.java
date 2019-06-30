package practiceProblems;

//Read more: http://www.java67.com/2012/12/how-to-reverse-string-in-java-stringbuffer-stringbuilder.html#ixzz5pN7HgOuD

public class String_Reverse {

	public static String reverseString(String str){
	    if (str == null || str.isEmpty())
	        return str;
	    
	    String reverse = "";
	    
	    for(int i = str.length() -1; i >= 0; i--) 
	        reverse = reverse + str.charAt(i);
	  
	    return reverse;
	}

	public static void main(String args[]) {
	      
	    // StringBuffer
	    String word = "HelloWorld";
	    String reverse = new StringBuffer(word).reverse().toString();
	    System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
	  
	    // StringBuilder
	    word = "WakeUp";
	    reverse = new StringBuilder(word).reverse().toString();
	    System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
	  
	    // Local method
	    word = "Band";
	    reverse = reverseString(word);
	    System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
	}   
}
