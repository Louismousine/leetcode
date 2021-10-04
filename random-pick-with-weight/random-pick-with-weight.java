class Solution {
Random rand = new Random();
    private int sum = 0;
    private int[] sums;
    public Solution(int[] w) {
        sums = new int[w.length];
        for(int i =0;i<w.length;i++){
            sum+= w[i];
            sums[i] = sum;
        }
        
    }
    
    public int pickIndex() {
        int rands = rand.nextInt(sums[sums.length-1])+1;
        int left = 0, right = sums.length - 1; 
        while(left < right){
            int mid = left + (right-left)/2;
            if(sums[mid] == rands)
                return mid;
            else if(sums[mid] < rands)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */