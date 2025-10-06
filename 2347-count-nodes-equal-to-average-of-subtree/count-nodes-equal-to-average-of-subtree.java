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
    int res=0;
    public int averageOfSubtree(TreeNode root) 
    {
        recur(root);
        return res;
    }
    public int[] recur(TreeNode root)
    {
        if(root==null)
        {
            return new int[]{0,0};
        }
        int left[]=recur(root.left);
        int right[]=recur(root.right);

        int arr[]=new int[2];
        arr[0]=left[0]+right[0]+root.val;
        arr[1]=left[1]+right[1]+1;

        if(arr[0]/arr[1]==root.val)
           res++;
        return arr;
    }
}