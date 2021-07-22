class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int lowerBound = 0;
        int higherBound = length-1;
        while (higherBound>=lowerBound){
            int midIndex = (higherBound+lowerBound)/2;
            if(nums[midIndex] == target){
                return midIndex;
            }
            else if(nums[midIndex] < target){
                lowerBound = midIndex+1;
            }
            else{
                higherBound = midIndex-1;
            }
        }
        return lowerBound;
    }
}