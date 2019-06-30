package practiceProblems;

class String_RotationOfEachOther { 
	static boolean areRotations_indexOf(String str1, String str2) { 
		
		if (str1.length() != str2.length())
			return false;
		
		// There lengths must be same and str2 must be a substring of str1 concatenated with str1.   
		if ((str1 + str1).indexOf(str2) != -1)
			return true;
		else 
			return false;
	} 
	
	static boolean areRotations_contains(String str1, String str2) { 
		
		if (str1.length() != str2.length())
			return false;
		
		// There lengths must be same and str2 must be a substring of str1 concatenated with str1.   
		if ((str1 + str1).contains(str2))
			return true;
		else 
			return false;
	} 
   

	public static void main (String[] args) { 
     
		String str1 = "ABCDE"; 
		String str2 = "CDEAB"; 

		if (areRotations_indexOf(str1, str2)) 
			System.out.println(str1 + " and " + str2 + " : Strings are rotations of each other"); 
		else
			System.out.println(str1 + " and " + str2 + " : Strings are not rotations of each other");
		
		if (areRotations_contains(str1, str2)) 
			System.out.println(str1 + " and " + str2 + " : Strings are rotations of each other"); 
		else
			System.out.println(str1 + " and " + str2 + " : Strings are not rotations of each other");
		
		str2 = "BDCEA";
		
		if (areRotations_indexOf(str1, str2)) 
			System.out.println(str1 + " and " + str2 + " : Strings are rotations of each other"); 
		else
			System.out.println(str1 + " and " + str2 + " : Strings are not rotations of each other");
		
		if (areRotations_contains(str1, str2)) 
			System.out.println(str1 + " and " + str2 + " : Strings are rotations of each other"); 
		else
			System.out.println(str1 + " and " + str2 + " : Strings are not rotations of each other");
	} 
} 
