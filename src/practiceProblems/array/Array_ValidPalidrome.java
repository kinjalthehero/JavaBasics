package practiceProblems.array;

public class Array_ValidPalidrome {

    public boolean validPalindrome(String s) {
        int l = -1, r = s.length();
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r))
                return isPalindromic(s, l, r+1) || isPalindromic(s, l-1, r);
        return true;
    }

    public boolean isPalindromic(String s, int l, int r) {
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r)) return false;
        return true;
    }

    public static void main(String[] args) {
        Array_ValidPalidrome vp = new Array_ValidPalidrome();
        System.out.println(vp.validPalindrome("qabcba"));
    }
}
