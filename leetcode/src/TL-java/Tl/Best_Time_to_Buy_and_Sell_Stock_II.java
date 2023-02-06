package Tl;

public class Best_Time_to_Buy_and_Sell_Stock_II {

    public static void main (String args[]) {
     System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {

        int current = prices[0];
        int max = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < current) {
                current = prices[i];
            }
            else if(prices[i] > current) {
                max += prices[i] - current;
                current = prices[i];
            }
        }

        return max;
    }
}
