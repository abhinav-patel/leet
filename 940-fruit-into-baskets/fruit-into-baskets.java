class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        int a=0;
        int b=0;// fixed to last occured in the subarray
        int countB=0;
        int maxLen=0,curr=0;

        for(int fruit:fruits)
        {
            if(fruit==a || fruit==b)
                curr=curr+1;
            else
                curr=countB+1;
            
            if(fruit==b)
            {
                countB+=1;
            }
            else
            {
                countB=1;
                a=b;
                b=fruit;
            }
            maxLen=Math.max(maxLen,curr);
        }
        return maxLen;   
    }
}