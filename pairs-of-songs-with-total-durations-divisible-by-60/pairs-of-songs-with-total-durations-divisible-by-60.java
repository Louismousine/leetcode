class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int p =0;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:time){
            int mod = i % 60;
            if(m.containsKey((60-mod)%60)){
                p+=m.get((60-mod)%60);
            }
            if(m.containsKey(mod)){
                m.put(mod,m.get(mod)+1);
            }
            else m.put(mod, 1);
        }
        return p;
    }
}