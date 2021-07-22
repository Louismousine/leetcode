class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for(char i: s.toCharArray()){
            if(i == '(' || i == '{' || i == '['){
                charStack.push(i);
            }
            else{
                if(charStack.isEmpty()){
                    return false;
                }
                char popped = charStack.pop();
                if((i == ')' && popped == '(') || (i == '}' && popped == '{') || (i == ']' && popped == '[')){
                    continue;
                }
                return false;
            }
        }
        if(!charStack.isEmpty()){
            return false;
        }
        return true;
    }
}