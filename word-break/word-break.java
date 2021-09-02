class Solution {
    HashMap<String, Boolean> map = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        //System.out.println(s);
        if(map.containsKey(s))return map.get(s);
        for(int i = 0; i<s.length();i++){
            for(String w: wordDict ){
                if(w.equals(s.substring(0,i+1))){
                    if(s.length()==w.length()) return true;
                    boolean works = wordBreak(s.substring(i+1,s.length()),wordDict);
                    map.put(s,works);
                    if(works){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}