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
    public TreeNode createBinaryTree(int[][] descriptions) 
    {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> children=new HashSet<>();

        for(int arr[]:descriptions)
        {
            children.add(arr[1]);
            TreeNode temp=map.getOrDefault(arr[0],new TreeNode(arr[0]));
            if(arr[2]==1)
            {
               temp.left=map.getOrDefault(arr[1],new TreeNode(arr[1]));
               map.put(arr[1],temp.left);
            }
            else
            {
               temp.right=map.getOrDefault(arr[1],new TreeNode(arr[1]));
               map.put(arr[1],temp.right);
            }
            map.put(arr[0],temp);
        }

        //int root;
        for(int arr[]:descriptions)
        {
            if(!children.contains(arr[0]))
            {
                return map.get(arr[0]);
            }
        }
        return null;
    }
}