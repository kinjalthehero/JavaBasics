package practiceProblems.string;

public class Delete {

    static boolean validPalindrome (String str) {

        int left = 0;
        int right = str.length()-1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                boolean avoidLeftChar = finalValidation(str.substring(0, left) + str.substring(left+1));
                boolean avoidRightChar = finalValidation(str.substring(0, right) + str.substring(right+1));

                return (avoidLeftChar || avoidRightChar);
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean finalValidation (String str) {

        int left = 0;
        int right = str.length()-1;

        while (left < right) {

            if (str.charAt(left++) != str.charAt(right--))
                return false;

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(validPalindrome("abcba"));
        System.out.println(validPalindrome("abdcba"));
        System.out.println(validPalindrome("abcdba"));
        System.out.println(validPalindrome("adbcba"));
        System.out.println(validPalindrome("abcbda"));
        System.out.println(validPalindrome("abecbda"));
        System.out.println(validPalindrome("abcbdea"));
    }
}
