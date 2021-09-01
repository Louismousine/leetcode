class Solution {
    
    HashMap<Integer,Integer> map = new HashMap<>();
    public int jump(int[] nums) {
        if(nums.length==0)return 0;
        return rec(nums,0);
    }
    
    private int rec(int[] n, int id){
        if(map.containsKey(id)){
            return map.get(id);
        }
        if(id>=n.length-1){
            return 0;
        }
        int min = Integer.MAX_VALUE-1;
        for(int i = n[id]; i >0;i--){
            min = Math.min(min, 1+rec(n, id+i));
        }
        map.put(id,min);
        
        return min;
    }
}