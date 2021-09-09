class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    public int longestPalindromeSubseq(String s) {
        return dp(s,0,s.length()-1);
    }
    
    int dp(String s, int b, int e){
        if(e<b || s.length()==0)return 0;
        if(e==b)return 1;
        String key = b+","+e;
        if(map.containsKey(key)){
            return map.get(key);
        }
        if(s.charAt(e)==s.charAt(b)){
            int max = dp(s,b+1,e-1)+2;
            map.put(key,max);
            return max;
        }
        int max = Math.max(dp(s,b+1,e),dp(s,b,e-1));
        map.put(key,max);
        return max;
    }
}