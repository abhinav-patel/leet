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
        //to measure dimension of the array
        int max=0;
        for(int arr[]:descriptions)
        {
            max=Math.max(max,Math.max(arr[0],arr[1]));
        }

        //to put all the children only on the map;
        TreeNode map[]=new TreeNode[max+1];
        for(int arr[]:descriptions)
        {
            map[arr[1]]=new TreeNode(arr[1]);
        }
        
        //to find only parent that is not in the map and it will be the root node and make it root
        TreeNode root=null;
        for(int arr[]:descriptions)
        {
            if(map[arr[0]]==null)
            {
                map[arr[0]]=new TreeNode(arr[0]);
                root=map[arr[0]];
                break;
            }
        }

        //to assign the lefts and rights
        for(int arr[]:descriptions)
        {
            if(arr[2]==1)
               map[arr[0]].left=map[arr[1]];
            else
               map[arr[0]].right=map[arr[1]];       
        }

        return root;




        /*HashMap<Integer,TreeNode> map=new HashMap<>();
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
        */
    }
}