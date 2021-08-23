class CustomStack {

    private ArrayList<Integer> stack;
    private int ind = 0;
    int max =0;
    
    public CustomStack(int maxSize) {
        stack = new ArrayList<>();
        max = maxSize;
    }
    
    public void push(int x) {
        if(ind>=max)return;
        stack.add(x);
        ind++;
    }
    
    public int pop() {
        if(ind>0){
            int s=stack.get(ind-1);
            stack.remove(ind-1);
            ind--;
            return s;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int j = 0;
        for(; j < k && j<ind; j++){
            stack.set(j,stack.get(j) + val);
        }
    }
}


/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */