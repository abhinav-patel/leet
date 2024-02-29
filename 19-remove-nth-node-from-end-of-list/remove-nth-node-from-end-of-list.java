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
        if(head==null|| n<0)
            return head;

        ListNode start=new ListNode(0);
        ListNode l1=start;
        ListNode l2=start;
        l2.next=head;
        for(int i=1;i<=n+1;i++)
            l1=l1.next;
        while(l1!=null)
        {
            l1=l1.next;
            l2=l2.next;
        }
        l2.next=l2.next.next;
        return start.next;

        
    }
}