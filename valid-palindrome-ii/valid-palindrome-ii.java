class Solution {
    public boolean validPalindrome(String s) {
        int h = 0;
        int t = s.length()-1;
        while(h<t){
            if(s.charAt(h)!=s.charAt(t)){
                return pal(s,h,t-1) || pal(s,h+1,t);
            }
            h++;t--;
        }
        return true;
    }
    
    boolean pal(String s, int h, int t){
        while(h<t){
            if(s.charAt(h)!=s.charAt(t)){
                return false;
            }
            h++;t--;
        }
        return true;
    }
}