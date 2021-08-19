class Solution {
    public boolean isRobotBounded(String instructions) {
        int hor = 0;
        int vert = 0;
        int dir = 0;
        for(Character c: instructions.toCharArray()){
            if(c=='L'){
                dir = (dir - 1) % 4;
            }
            else if (c=='R'){
                dir = (dir+1)%4;
            }
            else{
                switch(dir){
                    case 0: {hor++; break;}
                    case 1: {vert++; break;}
                    case 2: {hor--; break;}
                    case 3: {vert--; break;}     
                }
            }
            if(dir<0)dir+=4;
        }
        return dir != 0 || hor == 0 && vert == 0;
    }
}