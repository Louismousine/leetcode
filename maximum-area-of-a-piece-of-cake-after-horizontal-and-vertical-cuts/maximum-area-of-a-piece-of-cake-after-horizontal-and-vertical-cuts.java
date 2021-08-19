class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long hor = 0;
        long ver = 0;
        int mod = 1000000007;
        if(horizontalCuts.length ==0 || verticalCuts.length==0){
            return 0;
        }
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int last = 0;
        for(Integer i: horizontalCuts){
            hor = Math.max(hor, i-last);
            last = i;
        }
        hor = Math.max(hor, h-last);
        last = 0;
        for(Integer i: verticalCuts){
            ver = Math.max(ver, i-last);
            last = i;
        }
        ver = Math.max(ver, w-last);
        long area = (ver%mod * hor%mod)%mod;
        return  (int) area;
    }
}