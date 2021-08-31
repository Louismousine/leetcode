class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character, Integer> ch = new HashMap<>();
        int longest = 0;
        int beg = 1;
        int ind = 1;
        for(char c: s.toCharArray()){
            if(ch.containsKey(c) && ch.get(c)>=beg){
                beg = ch.get(c)+1;
            }
            ch.put(c, ind);
            ind++;
            longest = Math.max(longest, ind-beg);
        }
        return longest;
    }
}