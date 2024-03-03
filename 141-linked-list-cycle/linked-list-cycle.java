/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        if(head==null)
            return false;
        ListNode i=head.next;
        while(head!=null && i!=null)
        {
            if(head==i)
               return true;
            head=head.next;
            if(i.next!=null)
                i=i.next.next;
            else
                return false;
        }
        System.gc();
        return false;
        
        
    }
}