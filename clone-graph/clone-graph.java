/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        Node n = new Node(node.val);
        rec(node,n);
        return map.get(node);
    }
    
    private void rec(Node n, Node a){
            map.put(n,a);
            for(Node ne: n.neighbors){
                if(map.containsKey(ne)){
                    a.neighbors.add(map.get(ne));
                }else{
                    Node aa = new Node(ne.val);
                    a.neighbors.add(aa);
                    rec(ne,aa);
                }
        }
    }
    
}