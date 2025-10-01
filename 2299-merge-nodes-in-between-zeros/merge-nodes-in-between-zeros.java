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
class Solution 
{
    static{
        for(int i = 0; i < 1000; i++){
            mergeNodes(null);
        }
    }
    public static ListNode mergeNodes(ListNode head) 
    {
        if(head == null) return null;
        ListNode res=new ListNode(0);
        ListNode resHead=res;
        int sum=0;
        head=head.next;
        while(head!=null)
        {
            if(head.val==0)
            {
                res.next=new ListNode(sum);
                sum=0;
                res=res.next;
            }
            else
            {
                sum=sum+head.val;
            }
            head=head.next;
        }
        return resHead.next;  
    }
}