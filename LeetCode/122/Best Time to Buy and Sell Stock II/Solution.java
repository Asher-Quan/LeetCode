/**
 * Solution
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        for(int j = 1 ; j < prices.length ; j++){
            if(prices[j]<=prices[i])
                i = j;
            else{
                profit = profit + (prices[j] - prices[i]);
                i = j;
            }
        }
        return profit;
    }
}