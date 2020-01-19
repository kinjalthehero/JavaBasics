package practiceProblems.array;

public class Array_StockBuySell {

    public static int maxProfit(int prices[])
    {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (maxprofit < prices[i] - minprice)
                maxprofit = prices[i] - minprice;
        }

        return maxprofit;
    }

    static int maxProfit_kinjal (int prices[]) {

        int maxProfit = Integer.MIN_VALUE;
        int maxPrice = prices[prices.length-1];

        for (int i = prices.length-1; i >= 0; i--) {

            if (prices[i] > maxPrice)
                maxPrice = prices[i];
            else if (maxPrice - prices[i] > maxProfit)
                maxProfit = maxPrice - prices[i];
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        //System.out.println("Maximum profit :"+maxProfit_kinjal(arr));

        int arr2[]={1,2};
        System.out.println("Maximum profit :"+maxProfit_kinjal(arr2));
    }
}
