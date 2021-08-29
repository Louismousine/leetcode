class Solution {
    public int maximalSquare(char[][] matrix) {
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        for(int i = 0; i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int i = 0; i<dp[0].length;i++){
            dp[0][i] = 0;
        }
        int biggest = 0;
        for(int i = 1; i<dp.length;i++){
            for(int ii = 1; ii<dp[0].length;ii++){
                // dp[i][ii] = Math.min(Math.min(dp[i-1][ii-1],dp[i-1][ii]),dp[i][ii-1]);
                if(matrix[i-1][ii-1]=='1'){
                    dp[i][ii] = Math.min(Math.min(dp[i-1][ii-1],dp[i-1][ii]),dp[i][ii-1])+1;
                }
                biggest = Math.max(biggest,dp[i][ii] );
            }
        }
        int area = biggest * biggest;
        return area;
    }
}