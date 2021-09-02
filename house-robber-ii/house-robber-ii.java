class Solution {
    HashMap<String,Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int first = rec(nums,0,nums.length-2);
        int other = rec(nums,1,nums.length-1);
        return Math.max(first,other);
        
    }
    int rec(int[] n, int s, int e){
        String m = s+","+e;
        if(map.containsKey(m)) return map.get(m);
        if(s>e){
            return 0;
        }
        if(s==e){
            return n[s];
        }
        int a= Math.max(rec(n,s+1,e), n[s]+rec(n,s+2,e));
        map.put(m,a);
        return a;
        
    }
}