package practiceProblems.string;

public class String_AddNumbers {

    public static String addStrings(String num1, String num2)
    {
        int carry = 0;
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;

        StringBuilder sb = new StringBuilder();

        while (len1 >= 0 || len2 >= 0)
        {
            int digit1 = 0, digit2 = 0;

            if (len1 >= 0)
                digit1 = num1.charAt(len1) - '0';

            if (len2 >= 0)
                digit2 = num2.charAt(len2) - '0';

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;

            sb.append(sum % 10);

            len1--;
            len2--;
        }

        if (carry != 0)
            sb.append(carry);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String answer = addStrings("123", "456");
        System.out.println(answer);
    }




}
