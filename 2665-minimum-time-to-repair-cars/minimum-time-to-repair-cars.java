class Solution {
    public long repairCars(int[] ranks, int cars) 
    {
        if(ranks.length==1)
        {
           long res=(long)ranks[0]*cars*cars;
           return res;
        }
        long left=1,right=(long)1e14;
        for(int r:ranks)
           right=Math.min(right,r);
        right=right*cars*cars;

        while(left<right)
        {
            long mid=(left+right)/2;
            if(feasible(mid,ranks,cars))
            {
                right=mid;
            }
            else
               left=mid+1;
        }
        return left;   
    }
    public  boolean feasible(long mid,int ranks[],int cars)
    {
        long sum=0;
        for(int r:ranks)
        {
            sum+=Math.sqrt(mid/r);
            if(sum>=cars)
               return true;
        }
        return false;
    }
}