class Solution 
{
    static {
        for (int i = 1; i < 500; i++) {
            repairCars(new int[] {2, 7, 9, 23, 1, 7}, i);
        }
    }
    public static long repairCars(int[] ranks, int cars) 
    {
        if(ranks.length==1)
        {
           return (long)ranks[0]*cars*cars;
        }
        long left=1,right=(long)1e14;
        for(int r:ranks)
           right=Math.min(right,r);
        right=right*cars*cars;

        while(left<right)
        {
            long mid=left+(right-left)/2;
            if(feasible(mid,ranks,cars))
            {
                right=mid;
            }
            else
               left=mid+1;
        }
        return left;   
    }
    public static boolean feasible(long mid,int ranks[],int cars)
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