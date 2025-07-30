class Solution {
    public int minOperations(int[] nums, int k) 
    {
        boolean vis[]=new boolean[101];
        int c=0;
        for(int n:nums)
        {
            if(n<k)
               return -1;
            if(n==k)
               continue;
            if(vis[n]==false)
            {
               vis[n]=true;
               c++;
            }
        }
        return c;
        
    }
}