class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        int c=0;
        for(int i=0;i<fruits.length;i++)
        {
            for(int j=0;j<baskets.length;j++)
            {
                if(baskets[j]!=-1 && baskets[j]>=fruits[i])
                {
                    fruits[i]=-1;
                    baskets[j]=-1;
                    c++;
                    break;
                }
            }
        }
        return fruits.length-c;
    }
}