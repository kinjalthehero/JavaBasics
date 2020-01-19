package practiceProblems.string;

public class String_WaysOfDecoding {

    public static int numDecodings(String str)
    {
        if(str == null || str.length() == 0)
            return 0;

        int strLength = str.length();
        int[] dp = new int[strLength+1];

        // Length of zero = Nums of ways to decode 1
        dp[0] = 1;

        // Length of 1
        dp[1] = str.charAt(0) != '0' ? 1 : 0;

        // Length of 2
        for(int i = 2; i <= strLength; i++)
        {
            int first = Integer.valueOf(str.substring(i-1, i));
            int second = Integer.valueOf(str.substring(i-2, i));

            if(first >= 1 && first <= 9)
                dp[i] += dp[i-1];

            if(second >= 10 && second <= 26)
                dp[i] += dp[i-2];
        }

        return dp[strLength];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("12345"));
    }
}
