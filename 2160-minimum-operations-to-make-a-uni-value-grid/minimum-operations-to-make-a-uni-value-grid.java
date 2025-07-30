class Solution {
    public int minOperations(int[][] grid, int x) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
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
        
    }
}