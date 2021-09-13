class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        
        int currS = intervals[0][0];
        int currE = intervals[0][1];
        for(int i =1;i<intervals.length;i++){
            if(currE>=intervals[i][0]){
                currE = Math.max(currE,intervals[i][1]);
            }
            else{
                ans.add(new int[]{currS,currE});
                currS = intervals[i][0];
                currE = intervals[i][1];
            }
        }
        ans.add(new int[]{currS,currE});
        return ans.toArray(new int[ans.size()][]);
        
    }
}