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
}
