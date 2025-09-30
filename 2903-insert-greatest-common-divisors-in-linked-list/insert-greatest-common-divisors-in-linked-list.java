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
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tempHead=head; 
        while(head.next!=null)
        {
            int x=gcd(head.val,head.next.val);
            ListNode temp=new ListNode(x);
            ListNode next=head.next;
            head.next=temp;
            temp.next=next;
            head=head.next.next;
        }
        return tempHead;
        
    }
    public int gcd(int a,int b)
    {
        if(b==0)
           return a;
        return gcd(b,a%b);
    }
}