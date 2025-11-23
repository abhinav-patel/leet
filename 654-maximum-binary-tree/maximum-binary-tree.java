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
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) 
    {
        if(nums==null)
            return null;
        return build(nums,0,nums.length-1);   
    }
    TreeNode build(int arr[],int start,int end)
    {
        if(start>end)
            return null;
        
        int maxi=start;
        for(int i=start+1; i<=end; i++)
        {
            if(arr[i]>arr[maxi])
                maxi=i;
        }
        TreeNode root=new TreeNode(arr[maxi]);
        root.left=build(arr,start,maxi-1);
        root.right=build(arr,maxi+1,end);

        return root;
    }
}