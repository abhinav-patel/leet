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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists.length==0)
           return null;
        
        PriorityQueue<ListNode> que=new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>()
            {
                public int compare(ListNode a,ListNode b)
                {
                    if(a.val<b.val)
                       return -1;
                    else if(a.val==b.val)
                       return 0;
                    else
                       return 1;
                }
            }
        );

        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;

        for(ListNode node:lists)
        {
            if(node!=null)
               que.add(node);
        }
        while(!que.isEmpty())
        {
            tail.next=que.poll();
            tail=tail.next;

            if(tail.next!=null)
               que.add(tail.next);
        }
        return dummy.next;
        
    }
}