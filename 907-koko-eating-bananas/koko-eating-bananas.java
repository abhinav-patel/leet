class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int low=1,high=getMax(piles);
        int result=high;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canEat(piles,h,mid))
            {
                result =mid;
                high=mid-1;

            }
            else
               low=mid+1;
        }
        return result; 
    }
    public boolean canEat(int piles[],int hrs,int speed)
    {
        long hours=0;
        for(int pile:piles)
        {
            hours += (pile + speed - 1L) / speed;
            if(hours>hrs)
            return false;
        }
        return true;
    }
    private int getMax(int[] piles) {
    int max = 0;
    for (int pile : piles) {
        max = Math.max(max, pile);
    }
    return max;
}
}