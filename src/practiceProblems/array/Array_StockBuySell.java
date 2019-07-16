package practiceProblems.array;

public class Array_StockBuySell {


    public static int calculateMaxProfit(int[] arr)
    {
        int lowestPriceTillThatDay = arr[0];
        int maxProfit = Integer.MIN_VALUE;
        int profit = 0;

        for (int i = 0; i < arr.length; i++)
        {
            // If it is not the lowest price then find the profit value
            if(arr[i] > lowestPriceTillThatDay)
            {
                profit = arr[i] - lowestPriceTillThatDay;

                // If profit is greater than maxprofit then update maxProfit value
                if(profit > maxProfit)
                {
                    maxProfit = profit;
                }
            }
            else
            {
                lowestPriceTillThatDay = arr[i];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        System.out.println("Maximum profit :"+calculateMaxProfit(arr));

    }
}
