class Solution {
    public boolean canJump(int[] nums) {
        int farthestId = 0;
        for(int i =0;i<nums.length;i++){
            if(i<=farthestId){
                farthestId = Math.max(farthestId, i+nums[i]);
            }else return false;
        }
        return true;
    }
    
}