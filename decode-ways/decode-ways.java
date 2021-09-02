class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int numDecodings(String s) {
        return rec(0,s);
    }
    int rec(int n, String s){
        
        if(n==s.length())return 1;
        if(s.length()==0 || s.charAt(n)=='0')return 0;
        if(map.containsKey(n)) return map.get(n);
        int res = rec(n+1,s);
        if(s.length()-1>n&&(s.charAt(n)=='1'||s.charAt(n)=='2'&&s.charAt(n+1)<'7')){
            res+=rec(n+2,s);
        }
        map.put(n,res);
        return res;
    }
}