class Solution {
    public int maxSubArray(int[] nums) {
        int biggest = Integer.MIN_VALUE;
        int curr = 0;
        for(int i: nums){
            curr += i;
            biggest = Math.max(biggest, curr);
            if(curr<0)curr=0;
        }
        return biggest;
    }
}