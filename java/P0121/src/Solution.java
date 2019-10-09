public class Solution {
    // 动态规划
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int[] dp = new int[prices.length];
        int min = prices[0];
        for(int i = 1;i<prices.length;i++){
            dp[i] = Math.max(dp[i-1], prices[i]-min);
            if(prices[i]<min){
                min = prices[i];
            }
        }
        return dp[prices.length-1];
    }
}
