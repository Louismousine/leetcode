class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[k>nums.length?1:nums.length-k+1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int id =0;
        for(int i =0;i<nums.length;i++){
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            while(!q.isEmpty() && q.peek()<i-k+1){
                q.remove();
            }
            q.add(i);
            if(i>=k-1){
                ans[id++] = nums[q.peek()];
            }
        }
        return ans;
    }
}