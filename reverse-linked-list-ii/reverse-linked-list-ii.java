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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left == right)return head;
        ListNode h = head;
        ListNode curr = head;
        int count = 1;
        ListNode p = null;
        while(curr!=null){
            if(left==count){
                ListNode hd = p;
                ListNode nxt = curr;
                while(count<=right){
                    ListNode z = curr!=null?curr.next:null;
                    curr.next = p;
                    p=curr;
                    curr = z;
                    count++;
                }
                nxt.next = curr;
                if(left == 1) return p;
                hd.next = p;
                //if(left == 1) return p;
                return h;
            }
            p=curr;
            curr=curr.next;
            count++;
        }
        return h;
    }
}