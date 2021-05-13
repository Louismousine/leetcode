class Solution {
    public int romanToInt(String s) {
        char prev = '0';
        int num =0;
        for(int i = s.length()-1;i>=0;i--){
            char curr = s.charAt(i);
            switch(curr){
                case 'I':if(prev=='V' || prev=='X'){
                    num-=1;
                }
                    else { num+=1;}break;
                case 'X':if(prev=='L'||prev=='C'){
                    num-=10;
                }
                    else { num+=10;}break;
                case 'C':if(prev=='D'||prev=='M'){
                    num-=100;
                }
                    else { num+=100;}break;
                case 'V': num+=5;break;
                case 'L':num+=50;break;
                case 'D':num+=500;break;
                case 'M':num+=1000;
            }
            prev = curr;
        }
        return num;
    }
}