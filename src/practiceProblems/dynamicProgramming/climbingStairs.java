package practiceProblems.dynamicProgramming;

public class climbingStairs {
    public static int climbStairs(int n)
    {
        return climb_Stairs(0, n);
    }

    public static int climb_Stairs(int currentStep, int destinationStep)
    {
        if (currentStep > destinationStep)
            return 0;

        if (currentStep == destinationStep)
            return 1;

        return climb_Stairs(currentStep + 1, destinationStep) + climb_Stairs(currentStep + 2, destinationStep);
    }

    public static int climbStairs_memoization(int n)
    {
        // We will store result of every destination step in this array. There can be only 1 solution for every destination step.
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }

    public static int climb_Stairs(int currentStep, int destinationStep, int memo[])
    {
        if (currentStep > destinationStep)
            return 0;

        if (currentStep == destinationStep)
            return 1;

        // If already calculated then return the result, don't calculate again
        if (memo[currentStep] > 0)
            return memo[currentStep];

        memo[currentStep] = climb_Stairs(currentStep + 1, destinationStep, memo) + climb_Stairs(currentStep + 2, destinationStep, memo);
        return memo[currentStep];
    }

    public static void main (String[] args) {
        System.out.println(climbStairs(4));
        System.out.println(climbStairs_memoization(4));

        System.out.println(climbStairs(5));
        System.out.println(climbStairs_memoization(5));

        System.out.println(climbStairs(6));
        System.out.println(climbStairs_memoization(6));

    }

}