class Solution {
    public int maxArea(int[] height) {
        int startPtr = 0;
        int endPtr=height.length-1;
        int maxArea = 0;
        while(endPtr>startPtr){
            int smallest = Math.min(height[startPtr],height[endPtr]);
            maxArea = Math.max(maxArea,(endPtr-startPtr)*smallest);
            if(height[startPtr]==smallest){
                startPtr++;
            }
            else{
                endPtr--;
            }
        }
        return maxArea;
    }
}