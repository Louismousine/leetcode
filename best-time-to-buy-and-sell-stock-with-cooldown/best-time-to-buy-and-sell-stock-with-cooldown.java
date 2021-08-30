class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    public int maxProfit(int[] prices) {
        return rec(prices,0,false);
    }
    
    //true is holding a stock
    //false is can buy
    private int rec(int[] p, int id, boolean state){
        String s = id+","+state;
        if(map.containsKey(s)){
            return map.get(s);
        }
        if(id >= p.length-1){
            if(state){
                return p[id];
            }
            else{
                return 0;
            }
        }
        if(state){
            int hold = rec(p, id+1, true);
            int sell = p[id] + rec(p,id+2,false);
            int max = Math.max(sell,hold);
            map.put(s,max);
            return max;
        }
        int hold = rec(p, id+1, false);
        int buy = -p[id] + rec(p,id+1,true);
        int max = Math.max(buy,hold);
        map.put(s,max);
        return max;
        
    }
}