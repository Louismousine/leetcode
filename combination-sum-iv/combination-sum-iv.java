class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int combinationSum4(int[] nums, int target) {
        if(map.containsKey(target)) return map.get(target);
        int a = 0;
        for(int i: nums){
            if(i<target)
            a+=combinationSum4(nums, target-i);
            if(i==target)
                a++;
        }
        map.put(target,a);
        return a;
    }
}