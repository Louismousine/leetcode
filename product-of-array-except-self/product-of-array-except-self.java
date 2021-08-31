class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int p = 1;
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = p;
            p*=nums[i];
        }
        p=1;
        for(int i = ans.length-1 ; i >=0; i--){
            ans[i] *= p;
            p*=nums[i];
        }
        return ans;
    }
}