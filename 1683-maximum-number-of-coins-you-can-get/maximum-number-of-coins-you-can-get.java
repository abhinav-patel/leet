class Solution {
    public int maxCoins(int[] piles) 
    {
        int n=piles.length;
        int res=0;
        Arrays.sort(piles);
        int k=0;
        for(int i=n-2;;i=i-2)
        {
            k++;
            res+=piles[i];
            if(k==n/3)
                break;
        }
        return res;
    }
}