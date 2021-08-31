class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int negIdx = -1;
        int biggest = Integer.MIN_VALUE;
        int productUpToNeg = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                productUpToNeg = 1;
                product = 1;
                negIdx = -1;
                biggest = Math.max(biggest, 0);
                continue;
            }
            product *= nums[i];
            if(nums[i]<0 && productUpToNeg == 1){
                productUpToNeg = product;
                negIdx = i;
            }
            if(product<0 && i>negIdx){
                int temp = product;
                temp/=productUpToNeg;
                biggest = Math.max(biggest, temp);
            }else
            biggest = Math.max(biggest, product);
            
        }
        return biggest;
    }
}