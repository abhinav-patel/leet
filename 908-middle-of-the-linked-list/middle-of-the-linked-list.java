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
        ListNode l1=head;
        ListNode l2=head;
        while(l1!=null)
        {
            l1=l1.next;
            if(l1==null)
                return l2;
            l1=l1.next;
            l2=l2.next;

        }
        return l2;
        
        
    }
}