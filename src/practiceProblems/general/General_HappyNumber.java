package practiceProblems.general;

import java.util.HashSet;
import java.util.Set;

public class General_HappyNumber {

    public boolean isHappy(int number) {

        // HashSet is used to stop the infinite loop
        Set<Integer> set = new HashSet<>();
        int sum, remainder;

        while (set.add(number))
        {
            sum = 0;

            while (number > 0)
            {
                remainder = number % 10;
                sum += remainder * remainder;
                number = number / 10;
            }

            if (sum == 1)
                return true;
            else
                number = sum;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(happyNumber(19));
        System.out.println(happyNumber(15));
    }

    static boolean happyNumber (int num) {

        Set<Integer> nums = new HashSet<>();

        while (true) {

            int sum = 0;
            while (num != 0) {

                int remainder = num % 10;
                sum += Math.pow(remainder, 2);
                num /= 10;
            }

            if (sum == 1)
                return true;

            if (nums.contains(sum))
                return false;
            else
                nums.add(sum);

            num = sum;
        }
    }
}
