package practiceProblems.general;

public class General_Power {

    public static double myPow(double x, int n)
    {
        if(n == 0)
            return 1;

        // Special condition. OK to ignore this condition
        if(n == Integer.MIN_VALUE)
        {
            x = x * x;
            n = n/2;
        }

        if(n < 0)
        {
            n = -n;
            x = 1/x;
        }

        return x * myPow(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
    }
}
