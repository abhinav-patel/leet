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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        //dummy is taken to handle edge cases such as deletion of first node

        ListNode slow=dummy;
        ListNode fast=dummy;
        
        for(int i=0;i<=n;i++)
        {
            if(fast!=null)
               fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}