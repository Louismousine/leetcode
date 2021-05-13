class Solution {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        if(n==1)return x;
        if(n<0)return 1 / powHelp(x, -n);
        return powHelp(x,n);
    }
    
    private double powHelp(double x, int n){
        if(n==0)return 1;
        if(n==1)return x;
        double intermediateResult = powHelp(x,n/2);
        if(n%2==0){
            return intermediateResult * intermediateResult;
        }
        else{
            return intermediateResult * intermediateResult * x;
        }
    }
}