# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        n1 = 0
        n2 = 0
        factor = 1
        while l1 is not None:
            n1 = n1 + l1.val * factor
            l1 = l1.next
            factor = factor * 10
            
        factor = 1
        
        while l2 is not None:
            n2 = n2 + l2.val * factor
            l2 = l2.next
            factor = factor * 10
        
        n = n1 + n2
        if(n is 0):
            return ListNode(0)
        res = ListNode(0)
        head = res
        while n != 0:
            res.next = ListNode(n % 10)
            n = n/10
            res = res.next
        return head.next