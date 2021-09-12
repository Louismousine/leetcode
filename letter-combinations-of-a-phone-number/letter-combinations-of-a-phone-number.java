class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9',"wxyz");
        LinkedList<String> q = new LinkedList<>();
        if(digits.length()==0)return q;
        q.add("");
        for(int i = 0; i<digits.length();i++){
            while(q.peek().length()==i){
                String s = q.poll();
                String a = map.get(digits.charAt(i));
                for(int ii=0;ii<a.length();ii++){
                    q.add(s+a.charAt(ii));
                }
            }
        }
        return q;
    }
}