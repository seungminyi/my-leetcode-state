class Solution {
    public int maxProfit(int[] prices) {
        int lower = 1000000;
        int profit = 0;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < lower) {
                lower = prices[i];
                continue;
            }
            if(profit < prices[i] - lower) {
                profit = prices[i] - lower;
            }
        }
        
        return profit;
    }
}