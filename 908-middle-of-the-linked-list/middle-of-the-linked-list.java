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
    public ListNode middleNode(ListNode head) 
    {
        ListNode s1=head;
        ListNode s2=head;
        while(s2.next!=null && s2.next.next!=null)
        {
            s1=s1.next;
            s2=s2.next.next;
        }
        if(s2.next==null)
           return s1;
        return s1.next;
        
    }
}