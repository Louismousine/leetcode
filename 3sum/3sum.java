class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        if(nums.length < 3){
            return out;
        }
        Arrays.sort(nums);
        int last = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
            HashMap<Integer,Boolean> maia = new HashMap<>();
            int curr = nums[i];
            for(int ii = i + 1; ii < nums.length; ii++){
                if(curr == last) {
                    break;
                }
                if (maia.get(-nums[ii] - curr) != null && maia.get(-nums[ii] - curr)){
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(curr);
                    ans.add(-nums[ii] - curr);
                    ans.add(nums[ii]);
                    out.add(ans);
                    maia.put(-nums[ii]-curr, false);
                }else{
                    if(maia.get(nums[ii]) == null || maia.get(nums[ii]))
                maia.put(nums[ii],true);}
            }
            last = curr;
        }
        return out;
    }
}