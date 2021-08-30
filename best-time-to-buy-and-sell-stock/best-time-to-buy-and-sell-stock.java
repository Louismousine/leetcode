class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int p: prices){
            buy = Math.min(p, buy);
            profit = Math.max(p-buy,profit);
        }
        return profit>0?profit:0;
        
    }
}