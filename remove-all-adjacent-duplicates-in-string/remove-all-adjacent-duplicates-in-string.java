class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ss = new Stack<>();
        for(char c: s.toCharArray()){
            if(!ss.isEmpty() && ss.peek() == c){
                while(!ss.isEmpty() && ss.peek() == c){
                    ss.pop();
                }
            }
            else{
                ss.push(c);
            }
        }
        StringBuilder sss = new StringBuilder();
        while(!ss.isEmpty()){
            sss.append(ss.pop());
        }
        return sss.reverse().toString();
    }
}