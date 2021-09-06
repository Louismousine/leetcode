class Solution {
    HashMap<String, Integer> m= new HashMap<>();
    public int minDifficulty(int[] jobDifficulty, int d) {
        if(d>jobDifficulty.length)return -1;
        return dp(jobDifficulty,0,d);
    }
    
    int dp(int[] j, int id, int d){
        String key = id+","+d;
        if(m.containsKey(key)){
            return m.get(key);
        }

        
        int min = Integer.MAX_VALUE;
        int max = j[id];
        if(d==1){
            for(int i = id;i<j.length;i++){
                max = Math.max(max,j[i]);
            }
            m.put(key,max);
            return max;
        }
        for(int i = id;j.length-i+1>d;i++){
            max = Math.max(max,j[i]);
            min = Math.min(min,max+dp(j,i+1,d-1));
        }
        m.put(key,min);
        return min;
    }
}