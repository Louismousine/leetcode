class Solution {
    public boolean isPalindrome(int x) {
        int remainder = 0;
        int reversed = 0;
        int num = x;
        while(num>0){
            remainder = num % 10;
            reversed = remainder + reversed * 10;
            num/=10;
        }
        return reversed == x;
    }
}