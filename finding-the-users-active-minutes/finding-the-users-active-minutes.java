class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,Set<Integer>> hm = new HashMap<>();
        int[] ans = new int[k];
        for(int[] l: logs){
            if(hm.containsKey(l[0])){
                Set<Integer> x = hm.get(l[0]);
                x.add(l[1]);
                hm.put(l[0],x);
            }
            else{
                Set<Integer> x = new HashSet<>();
                x.add(l[1]); 
                hm.put(l[0],x);
            }
        }
        
        for(Set<Integer> s: hm.values()){
            ans[s.size()-1]++;
        }
        return ans;
    }
}