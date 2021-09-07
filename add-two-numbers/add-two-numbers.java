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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode prev = null;
        while(l1!=null && l2!=null){
            ListNode curr = new ListNode((l1.val+l2.val+carry)%10);
            carry = (l1.val+l2.val+carry)/10;
            if(prev!=null)prev.next = curr;
            prev = curr;
            l1 = l1.next;
            l2=l2.next;
            if(head==null)head=curr;
        }
        while(l1!=null){
            ListNode curr = new ListNode((l1.val+carry)%10);
            carry = (l1.val+carry)/10;
            if(prev!=null)prev.next = curr;
            prev = curr;
            l1 = l1.next;
            if(head==null)head=curr;
        }
        while(l2!=null){
            ListNode curr = new ListNode((l2.val+carry)%10);
            carry = (l2.val+carry)/10;
            if(prev!=null)prev.next = curr;
            prev = curr;
            l2 = l2.next;
            if(head==null)head=curr;
        }
        if(carry!=0){
            ListNode curr = new ListNode(carry);
            prev.next = curr;
        }
        return head;
    }
}