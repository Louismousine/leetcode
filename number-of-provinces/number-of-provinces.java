class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int idx = 0;
        int ans = 0;
        for(;idx<isConnected.length;idx++){
            if(!set.contains(idx)){
                set.add(idx);
                q.add(idx);
                ans++;
            }
            while(!q.isEmpty()){
                int curr = q.poll();
                for(int i = 0; i<isConnected.length;i++){
                    if(isConnected[curr][i]==1 && !set.contains(i)){
                        set.add(i);
                        q.add(i);
                    }
                }
            }
        }
        return ans;
        
    }
}