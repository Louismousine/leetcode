class Solution {
    ArrayList<Integer>[] graph;
    int[] lowTimes;
    int[] visitedTimes;
    int time = 0;
    List<List<Integer>> critical = new ArrayList<>();
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        graph = new ArrayList[n];
        lowTimes = new int[n];
        visitedTimes = new int[n];
        for(int i = 0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(List<Integer> connection: connections){
            graph[connection.get(0)].add(connection.get(1));
            graph[connection.get(1)].add(connection.get(0));
        }
        
        boolean[] vis = new boolean[n];
        dfs(vis,0,-1);
        return critical;
    }
    
    void dfs(boolean[] visited, int curr, int par){
        visited[curr] = true;
        visitedTimes[curr] = time;
        lowTimes[curr] = time++;
        for(int n: graph[curr]){
            if(n==par){
                continue;
            }
            if(!visited[n]){
                dfs(visited, n, curr);
                lowTimes[curr] = Math.min(lowTimes[n], lowTimes[curr]);
                if(lowTimes[n] > visitedTimes[curr]){
                    critical.add(Arrays.asList(curr, n));
                }
            }
            else{
                lowTimes[curr] = Math.min(lowTimes[curr], visitedTimes[n]);
            }
        }
    }
}