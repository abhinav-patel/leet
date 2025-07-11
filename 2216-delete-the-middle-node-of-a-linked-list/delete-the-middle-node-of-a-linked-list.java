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
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head==null||head.next==null)
           return null;
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        ListNode prev=head;
        ListNode slow=head.next;
        ListNode fast=head.next.next;
        while(fast.next!=null&&fast.next.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null)
           prev.next=slow.next;
        else
           slow.next=slow.next.next;

        return head;
        
    }
}