class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    fillZero(matrix,i,j);
                }
            }
        }
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j]==Integer.MIN_VALUE+1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    private void fillZero(int[][] matrix, int row, int col){
        for(int j = 0; j < matrix[0].length;j++){
            if(matrix[row][j]!=0){
                matrix[row][j] = Integer.MIN_VALUE+1;
            }
        }
        
        for(int j = 0; j < matrix.length;j++){
            if(matrix[j][col]!=0){
                matrix[j][col] = Integer.MIN_VALUE+1;
            }
        }
    }
}