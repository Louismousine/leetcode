class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        if(map.containsKey(amount)){
            return map.get(amount);
        }
        boolean possible = false;
        for(int c: coins){
            if(c==amount){
                return 1;
            }
            if(c<amount){
                possible = true;
            }
        }
        if(!possible){
            return -1;
        }
        int ans = Integer.MAX_VALUE;
        for(int c: coins){
            int res = 1 + coinChange(coins,amount-c);
            if(res>0){
                ans = Math.min(res,ans);
            }
        }
        map.put(amount, ans);
        return ans!=Integer.MAX_VALUE?ans:-1;
        
    }
}