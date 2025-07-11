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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null||head.next==null)
           return head;
        ListNode tail=head;
        int l=1;
        while(tail.next!=null)
        {
            l++;
            tail=tail.next;
        }
        tail.next=head;
        k=k%l;
        for(int i=1;i<l-k;i++)
        {
            head=head.next;
        }
        ListNode prev=head;
        head=head.next;
        prev.next=null;
        return head;
        
        
    }
}