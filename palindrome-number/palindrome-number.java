class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";
        int length = s.length();
        for(int i = 0 ; i<length/2;i++){
            if(s.charAt(i)!=s.charAt(length-i-1))return false;
        }
        return true;
    }
}