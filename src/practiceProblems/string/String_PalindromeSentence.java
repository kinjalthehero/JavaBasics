package practiceProblems.string;

public class String_PalindromeSentence {

    public static boolean isPalindrome(String s)
    {
        if (s.isEmpty())
            return true;

        int head = 0;
        int tail = s.length() - 1;
        char headChar, tailChar;

        while(head <= tail)
        {
            headChar = s.charAt(head);
            tailChar = s.charAt(tail);

            if (!Character.isLetterOrDigit(headChar))
            {
                head++;
            }
            else if(!Character.isLetterOrDigit(tailChar))
            {
                tail--;
            }
            else
            {
                if (Character.toLowerCase(headChar) != Character.toLowerCase(tailChar))
                    return false;

                head++;
                tail--;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}


