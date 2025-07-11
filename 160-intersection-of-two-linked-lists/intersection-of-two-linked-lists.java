/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int l1=1;
        int l2=1;
        ListNode curr1=headA;
        ListNode curr2=headB;
        while(curr1.next!=null)
        {
            l1++;
            curr1=curr1.next;
        }
        while(curr2.next!=null)
        {
            l2++;
            curr2=curr2.next;
        }
        if(curr1!=curr2)
           return null;
        int diff=Math.abs(l1-l2);
        if(l1>l2)
        {
            while(diff>0)
            {
                headA=headA.next;
                diff--;
            }
            while(headA!=headB)
            {
                headA=headA.next;
                headB=headB.next;
            }
            return headA;      
        }
        else
        {
            while(diff>0)
            {
                diff--;
                headB=headB.next;
            }
            while(headA!=headB)
            {
                headA=headA.next;
                headB=headB.next;
            }
            return headB;
        }
    }
}