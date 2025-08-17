/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public TreeNode recoverFromPreorder(String traversal) 
    {
        Map<Integer,TreeNode> levels=new HashMap<>();
        int i=0;

        while(i<traversal.length())
        {
            int currLevel=0;
            while(i<traversal.length() && traversal.charAt(i)=='-')
            {
                currLevel++;
                i++;
            }

            int n=0;
            while(i<traversal.length() && traversal.charAt(i)>='0' && traversal.charAt(i)<='9' )
            {
                n*=10;
                n+=(traversal.charAt(i)-'0');
                i++;
            }
            
            TreeNode temp=new TreeNode(n);
            levels.put(currLevel, temp);
            if(currLevel>0)
            {
                TreeNode parent=levels.get(currLevel-1);
                if(parent.left==null)
                   parent.left=temp;
                else
                   parent.right=temp;
            }
        }
        return levels.get(0);
    }
}