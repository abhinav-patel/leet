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
    public int getDecimalValue(ListNode head) 
    {
        int base=1;
        Stack<Integer> st=new Stack<>();
        int sum=0;
        while(head!=null)
        {
            st.add(head.val);
            head=head.next;
        }
        while(!st.isEmpty())
        {
            sum+=base*st.pop();
            base=base*2;
        }
        return sum;
        
    }
}