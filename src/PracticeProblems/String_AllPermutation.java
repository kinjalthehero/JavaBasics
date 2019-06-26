package PracticeProblems;

// Didn't understand the logic of this code. Spend time later.

/*
 * For example, given a String "XYZ", this program will print all 6 possible permutations of
 * input e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX
 */
public class String_AllPermutation {

   public static void main(String args[]) {
       permutation("123");
   }

   public static void permutation(String input){
         permutation("", input);
  }

  /*
   * Recursive method which actually prints all permutations
   * of given String, but since we are passing an empty String
   * as current permutation to start with,
   * I have made this method private and didn't exposed it to client. 
   */
  private static void permutation(String perm, String word) {
       if (word.isEmpty()) {
           System.out.println(perm + word);
       } else {
           for (int i = 0; i < word.length(); i++) {
               permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
           }
       }
   }
}