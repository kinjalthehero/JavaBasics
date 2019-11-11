package practiceProblems.string;

import java.util.HashSet;

public class String_AllUniqueChar {

    public static boolean hasAllUniqueChars (String word) {

        HashSet<Character> set = new HashSet<>();

        for(int index=0; index < word.length(); index ++)   {

            char c =word.charAt(index);

            boolean check = set.add(c) ? true: false;

            // If Hashset's add method return false,that means it is already present in HashSet
            if(!set.add(c))
                return false;
        }

        return true;
    }

    public static boolean hasAllUniqueCharsMethod2 (String word) {

        for(int index=0; index < word.length(); index ++)   {

            char c = word.charAt(index);

            // indexOf(): This method returns the first occurrence of the specified character or substring.
            // lastIndexOf(): This method returns the last occurrence of the specified character or substring.
            if(word.indexOf(c) != word.lastIndexOf(c))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("java2blog has all unique chars : "+ hasAllUniqueChars("java2blog"));
        System.out.println("Apple has all unique chars : "+ hasAllUniqueChars("apple"));
        System.out.println("index has all unique chars : "+ hasAllUniqueChars("index"));
        System.out.println("world has all unique chars : "+ hasAllUniqueChars("world"));

        //hasAllUniqueCharsMethod2
        System.out.println("java2blog has all unique chars : "+ hasAllUniqueCharsMethod2("java2blog"));
        System.out.println("Apple has all unique chars : "+ hasAllUniqueCharsMethod2("apple"));
        System.out.println("index has all unique chars : "+ hasAllUniqueCharsMethod2("index"));
        System.out.println("world has all unique chars : "+ hasAllUniqueCharsMethod2("world"));
    }



}
