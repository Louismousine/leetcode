class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }
            else{
                List<String> st = new ArrayList<>();
                st.add(s);
                map.put(sorted,st);
            }
        }
        
        List<List<String>> ret = new ArrayList<>();
        for(String s: map.keySet()){
            ret.add(map.get(s));
        }
        return ret;
    }
}