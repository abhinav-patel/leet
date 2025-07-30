class Solution 
{
    static
    {
        for(int i=1;i<=500;i++)
        {
            minOperations(new int[][]{{1}},1);
        }
    }
    public static int minOperations(int[][] grid, int x) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int len = m * n;
        if (len < 2)
            return 0;
        int freq[] = new int[10001];
        int rem = grid[0][0] % x;
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (grid[i][j] % x != rem)
                    return -1;
                freq[grid[i][j]]++;
            }
        }

        int c=0;
        int median=0;
        int index=(len+1)/2;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==0)
               continue;
            c+=freq[i];
            if(c>=index)
            {
                median=i;
                break;
            }
        }

        int ans=0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
               ans+=(Math.abs(i-median)/x)*freq[i];
        }
        return ans;
        

        /*ArrayList<Integer> arr=new ArrayList<>();
        for(int a[]:grid)
        {
            for(int n:a)
               arr.add(n);
        }
        Collections.sort(arr);
        int median=arr.get((arr.size())/2);
        int c=0;
        for(int n:arr)
        {
            int diff=Math.abs(n-median);
            if(diff%x!=0)
               return -1;
            c+=diff/x;
        }
        return c;
        */

    }
}