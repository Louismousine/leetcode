class LFUCache {
    PriorityQueue<Node> q = new PriorityQueue<>();
    int cap;
    HashMap<Integer, Node> map = new HashMap<>();
    int time = 0;

    public LFUCache(int capacity) {
        cap = capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))return -1;
        Node n = map.get(key);
        q.remove(n);
        n.time = time++;
        n.count++;
        q.add(n);
        return n.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            q.remove(n);
            n.time=time++;
            n.count++;
            n.value = value;
            q.add(n);
        }
        else{
            if(cap<=q.size()){
                if(cap==0)return;
                Node a = q.poll();
                map.remove(a.key);
            }
            Node n = new Node(value,time++,key);
            map.put(key,n);
            q.add(n);
        }
    }
}

class Node implements Comparable{
    int count = 0;
    int time;
    int value;
    int key;
    
    Node(int value, int time, int key){
        this.time = time;
        this.value = value;
        this.key = key;
    }
    
    public int compareTo(Object o){
        Node c = (Node) o;
        if(this.count==c.count && this.time==c.time) return 0;
        if(this.count>c.count || this.count==c.count && this.time>c.time)return 1;
        return -1;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */