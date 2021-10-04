class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length<2)return false;
        map.put(0,-1);
        int sum = 0;
        int i = 0;
        for(int n:nums){
            sum+=n;
            sum%=k;
            if(map.containsKey(sum) && -map.get(sum)+i>1) return true;
            if(!map.containsKey(sum))map.put(sum,i);
            i++;
        }
        return false;
    }
}