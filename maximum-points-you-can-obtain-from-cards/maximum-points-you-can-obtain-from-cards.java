class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    
    public int maxScore(int[] cardPoints, int k) {
        int i = 0;
        int max = 0;
        int sum = 0;
        int l = cardPoints.length;
        for(;i<k;i++){
            sum+=cardPoints[l-k+i];
        }
        max = sum;
        i=0;
        for(;i<k;i++){
            sum+=cardPoints[i]-cardPoints[l-k+i];
            max = Math.max(sum,max);
        }
        return max;
    }
}