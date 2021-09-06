class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<P> q = new PriorityQueue<>();
        for(int[] p: points){
            q.add(new P(p));
        }
        int[][] ans = new int[k][2];
        for(int i =0;i<k;i++){
            ans[i] = q.poll().coord;
        }
        return ans;
    }
}
class P implements Comparable{
    int[] coord;
    double dist;
    P(int[] c){
       coord=c;
        dist=Math.sqrt(Math.pow(coord[0],2)+Math.pow(coord[1],2));
    }
    public int compareTo(Object o){
        P p = (P)o;
        if(p.dist==this.dist)return 0;
        if(p.dist>this.dist)return -1;
        return 1;
    }
}