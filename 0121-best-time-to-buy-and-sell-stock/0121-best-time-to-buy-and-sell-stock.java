class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i =0; i < prices.length; i++){
            if (prices[i] < buy){
                buy = prices[i];
            } else {
                maxprofit = Math.max(maxprofit, prices[i] - buy);
            }
        }
        return maxprofit;
    }
}