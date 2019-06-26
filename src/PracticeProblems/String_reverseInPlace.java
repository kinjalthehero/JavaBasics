package PracticeProblems;


/*
 * Since String is Immutable in Java, you cannot reverse. the same String, but a new String is get created. This program reverse a string in place using StringBuilder
 */

public class String_reverseInPlace {

    public static void main(String args[]) {

        String number = "1234";
        System.out.println("original String: " + number);
        String reversed = inPlaceReverse(number);
        System.out.println("reversed String: " + reversed);
    }

    /*
     * Java method to replace a String in place
     */
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
}