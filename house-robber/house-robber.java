class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        return rec(nums,0);
    }
    int rec(int[] nums, int i){
        if(map.containsKey(i)) return map.get(i);
        if(i>=nums.length) return 0;
        map.put(i,Math.max(rec(nums,i+1),rec(nums,i+2)+nums[i]));
        return map.get(i);
    }
}