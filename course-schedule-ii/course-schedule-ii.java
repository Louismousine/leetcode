class Solution {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    List<Integer> ans = new ArrayList<>();
    boolean impossible = false;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<Integer>());
        }
        for(int[] p: prerequisites){
            map.get(p[0]).add(p[1]);
        }
        for(int i = 0; i<numCourses;i++){
            if(impossible){
                return new int[0];
            }
            dfs(i,new ArrayList<Integer>());
        }
        return ans.stream().mapToInt(i -> i).toArray();
        
    }
    void dfs(int id, List<Integer> vis){
        List<Integer> visi = new ArrayList<>(vis);
        if(impossible) return;
        List<Integer> l = map.get(id);
        if(l.size()==0){
            if(ans.contains(id)){
                return;
            }
        }
        visi.add(id);
        for(Integer s: map.get(id)){
            if(visi.contains(s)){
                impossible = true;
                return;
            }
            dfs(s,visi);
        }
        map.put(id,new ArrayList<>());
        ans.add(id);
        
    }
}