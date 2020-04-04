package practiceProblems.string;

public class String_AddNumbers {

    public static String addStrings_orig(String num1, String num2)
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
        String answer = addStrings("1", "9");
        System.out.println(answer);
    }

    public static String addStrings(String num1, String num2) {

        char[] num1Arr = num1.toCharArray();
        char[] num2Arr = num2.toCharArray();
        int num1Pointer = num1Arr.length-1;
        int num2Pointer = num2Arr.length-1;
        int sum = 0;
        int carry = 0;
        int remainder = 0;
        StringBuilder sb = new StringBuilder();

        while (num1Pointer >= 0 && num2Pointer >=0) {

            int number1 = num1Arr[num1Pointer] - '0';
            int number2 = num2Arr[num2Pointer] - '0';

            sum = number1 + number2 + carry;

            remainder = sum%10;
            carry = sum/10;

            System.out.println(remainder);
            System.out.println(carry);

            char remiainderInString = (char) (remainder + '0');

            sb.append(remiainderInString);

            num1Pointer--;
            num2Pointer--;
        }

        if (num1Pointer >= 0) {
            int number1 = num1Arr[num1Pointer] - '0';
            remainder = number1%10;
            sb.append(remainder);
        }

        if (num2Pointer >= 0) {
            int number2 = num2Arr[num2Pointer] - '0';
            remainder = number2%10;
            sb.append(remainder);
        }

        return sb.reverse().toString();
    }




}
