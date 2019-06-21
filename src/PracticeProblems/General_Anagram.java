package PracticeProblems;

import java.util.Arrays;

public class General_Anagram {
   
	// Method 1: Remove chars from str2
    public static boolean isAnagram(String str1, String str2){       
        
    	if (str1.length() != str2.length())
            return false;
       
        char[] chars = str1.toCharArray();
       
        for (char str1Char : chars) {
            
        	int index = str2.indexOf(str1Char);
            
        	// Take one char at a time from str1
        	// Remove that char from str2
        	// If all chars are gone from str2 then string is anagram 
        	if(index != -1)
                str2 = str2.substring(0,index) + str2.substring(index +1, str2.length());
            else
                return false;        
        }
       
        return str2.isEmpty();
    }
   
    // Method 2: Sort and compare
    public static boolean iAnagram(String str1, String str2) {
    	
        char[] charFromStr1 = str1.toCharArray();
        char[] charFromStr2 = str2.toCharArray();       
        Arrays.sort(charFromStr1);
        Arrays.sort(charFromStr2);
       
        return Arrays.equals(charFromStr1, charFromStr2);
    }
   
    // Method 3
    public static boolean checkAnagram(String str1, String str2){
        char[] characters = str1.toCharArray();
        StringBuilder sbSecond = new StringBuilder(str2);
       
        for(char ch : characters){
        	
        	// Why "" is included in indexOf?
            int index = sbSecond.indexOf("" + ch);
            
            if(index != -1)
                sbSecond.deleteCharAt(index);
            else
                return false;
        }
       
        return sbSecond.length()==0 ? true : false;
    }
    
    public static void main(String[] args) {
    	
    	String str1 = "abc";
    	String str2 = "bac";
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + isAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + iAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + checkAnagram(str1,str2));
    	System.out.println();
    	
    	str1 = "abc";
    	str2 = "bad";
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + isAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + iAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + checkAnagram(str1,str2));
    	System.out.println();
    	
    	str1 = "abc";
    	str2 = "bacd";
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + isAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + iAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + checkAnagram(str1,str2));
    	System.out.println();
    	
    	str1 = "aaa";
    	str2 = "aaa";
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + isAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + iAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + checkAnagram(str1,str2));
    	System.out.println();
    	
    	str1 = "aab";
    	str2 = "aba";
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + isAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + iAnagram(str1,str2));
    	System.out.println(str1 + " and " + str2 + " are Anagram? " + checkAnagram(str1,str2));
    	System.out.println();
    }
}

