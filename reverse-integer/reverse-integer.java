class Solution {
    public int reverse(int x) {
        int ans = 0;
        boolean neg = x<0;
        if(neg){
            x*=-1;
        }
        int prev = ans;
        while(x>0){
            prev=(x%10)+ans*10;
            if((prev-x%10)/10!=ans)return 0;
            ans=prev;
            x/=10;
        }
        if(neg)ans*=-1;
        return ans;
    }
}