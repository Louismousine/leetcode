/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        Queue<ListNode> q = new LinkedList<>();
        for(ListNode n: lists){
            q.add(n);
        }
        while(q.size()>1){
            q.add(merge(q.poll(),q.poll()));
        }
        return q.poll();
    }
    
    private ListNode merge(ListNode a, ListNode b){
        ListNode curr=new ListNode();
        ListNode head=curr;
        while(a!=null && b!=null){
            if(a.val>=b.val){
                curr.next=b;
                b=b.next;
            }
            else{
                curr.next=a;
                a=a.next;
            }
            curr=curr.next;
        }
        if(a==null){
            curr.next=b;
        }
        else{
            curr.next=a;
        }
        return head.next;
        
    }
}