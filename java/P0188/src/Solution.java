public class Solution {
    public int maxProfit(int k, int[] prices) {
        int K = k;
        if(K>prices.length/2) return greedy(prices);
        if(prices.length == 0) return 0;
        int[][] dp = new int[prices.length][K+1];
        int min = prices[0];
        for(int k1=1;k1<=K;k1++){
            min = prices[0];
            for(int i = 1;i<prices.length;i++){
                min = Math.min(min, prices[i]-dp[i][k1-1]);
                dp[i][k1]=Math.max(dp[i-1][k1],prices[i]-min);
            }
        }
        return dp[prices.length-1][K];
    }
    public int greedy(int[] prices){
        if(prices.length == 0) return 0;
        int res = 0;
        for(int i=1;i<prices.length;i++){
            res += prices[i]-prices[i-1]>0 ? prices[i]-prices[i-1]:0;
        }
        return res;
    }
}