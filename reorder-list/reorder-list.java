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
    public void reorderList(ListNode head) {
        if(head==null) return;
        int count = 0;
        ListNode c = head;
        Stack<ListNode> s = new Stack<>();
        while(c!=null){
            s.push(c);
            c=c.next;
            count++;
        }
        c=head;
        for(int i =0;i<(1+count)/2;i++){
            ListNode n = c.next;
            ListNode f=s.pop();
            c.next=f;
            if((1+count)/2-1>i)
            f.next=n;else f.next=null;
            c=n;
        }
        
    }
}