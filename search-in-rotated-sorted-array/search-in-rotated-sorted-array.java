class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int middle = (left+right)/2;
        while(left<=right){
            if(nums[middle] == target) return middle;
            if(nums[middle] >= nums[left]){
                if(nums[left] > target || target > nums[middle]){
                    left = middle+1;
                    middle = (left+right)/2;
                }
                else{
                    right = middle -1;
                    middle = (left+right)/2;
                }
            }
            else{
                if(nums[right] < target || nums[middle] > target){
                    right = middle - 1;
                    middle = (left+right)/2;
                }else{
                left = middle+1;
                middle = (left+right)/2;
                }
            }
        }
        return -1;
    }
}