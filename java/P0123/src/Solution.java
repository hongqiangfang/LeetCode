public class Solution {
    public int maxProfit(int[] prices) {
        int K = 2;
        if(prices.length == 0) return 0;
        int[][] dp = new int[prices.length][3];
        int min = prices[0];
        for(int k=1;k<=K;k++){
            min = prices[0];
            for(int i = 1;i<prices.length;i++){
                min = Math.min(min, prices[i]-dp[i][k-1]);
                dp[i][k]=Math.max(dp[i-1][k],prices[i]-min);
            }
        }
        return dp[prices.length-1][K];
    }
}
