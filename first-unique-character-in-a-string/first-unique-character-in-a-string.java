class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char l: s.toCharArray()){
            if(hm.containsKey(l)){
                hm.put(l,hm.get(l)+1);
            }
            else{
                hm.put(l,1);
            }
        }
        int ans = Integer.MAX_VALUE;
        for(Character ss: hm.keySet()){
            if(hm.get(ss)==1){
                ans=Math.min(s.indexOf(ss),ans);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}