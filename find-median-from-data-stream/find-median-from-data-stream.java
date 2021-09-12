class MedianFinder {

    PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> max = new PriorityQueue<>();
    boolean ev = true;
    
    public void addNum(int num) {
        if(ev){
            ev = false;
            min.add(num);
            max.add(min.poll());
        }
        else{
            ev = true;
            min.add(num);
            max.add(min.poll());
            min.add(max.poll());
        }
    }
    
    public double findMedian() {
        return ev?(max.peek()+min.peek())/2.0:max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */