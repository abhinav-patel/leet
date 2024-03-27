class Solution {
    public int maxProfit(int[] prices) 
    {
        int ltn=Integer.MAX_VALUE;//least till now
        int mp=0;//maximum profit
        int pist=0;//profit if sold today

        for(int i=0;i<prices.length;i++)
        {
            ltn=(prices[i]<ltn)?prices[i]:ltn;
            //if(prices[i]<ltn)
               // ltn=prices[i];
            pist=prices[i]-ltn;
            mp=(pist>mp)?pist:mp;
            //if(pist>mp)
                //mp=pist;
        }
        return mp;

        
    }
}