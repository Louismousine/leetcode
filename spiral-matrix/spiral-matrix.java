class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        int clearedRowBottom = 0;
        int clearedRowTop = matrix.length-1;
        int clearedColLeft = 0;
        int clearedColRight = matrix[0].length-1;
        
        int r = 0;
        int c = 0;
        int dir = 0; //0 r, 1 b, 2 l,3 u
        while(true){
            //System.out.println(dir+" "+r+","+c);
            ret.add(matrix[r][c]);
            if(dir==0){
                if(c==clearedColRight){
                    dir = 1;
                    r++;
                    if(r>clearedRowTop) break;
                    clearedRowBottom++;
                }else{
                    c++;
                }
            }
            else if(dir==1){
                if(r==clearedRowTop){
                    dir = 2;
                    c--;
                    if(c<clearedColLeft) break;
                    clearedColRight--;
                }else{
                    r++;
                }
            }
            else if(dir==2){
                if(c==clearedColLeft){
                    dir = 3;
                    r--;
                    if(r<clearedRowBottom) break;
                    clearedRowTop--;
                }else{
                    c--;
                }
            }
            else if(dir==3){
                if(r==clearedRowBottom){
                    dir = 0;
                    c++;
                    if(c>clearedColRight) break;
                    clearedColLeft++;
                }else{
                    r--;
                }
            }
        }
        return ret;
    }
}