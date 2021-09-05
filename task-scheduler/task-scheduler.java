class Solution {
    HashMap<Character, Task> map = new HashMap<>();
    public int leastInterval(char[] tasks, int n) {
        for(char c: tasks){
            if(map.containsKey(c)){
                Task t = map.get(c);
                t.count++;
            }
            else{
                map.put(c, new Task(c));
            }
        }
        PriorityQueue<Task> q = new PriorityQueue<>();
        q.addAll(map.values());
        int time = 0;
        List<Task> taskss;
        while(!q.isEmpty()){
            taskss = new ArrayList<>();
            while(!q.isEmpty()){
            Task t = q.poll();
            if(t.earliest <= time){
                t.count--;
                t.earliest = time + n + 1;
                if(t.count>0)taskss.add(t);
                break;
            }if(t.count>0)taskss.add(t);}
            time++;
            q.addAll(taskss);
            //if(t.count>0)q.add(t);
        }
        return time;
        
    }
}
class Task implements Comparable{
    int count = 0;
    char v;
    int earliest = 0;
    public int compareTo(Object o){
        Task t = (Task) o;
        if(t.count==this.count && this.earliest==t.earliest)return 0;
        //if(t.earliest>this.earliest || t.earliest==this.earliest && t.count<this.count) return -1;
        if(t.count<this.count || t.earliest>this.earliest && t.count==this.count) return -1;
        return 1;
    }
    public Task(char c){
        v =c;
        count = 1;
    }
}