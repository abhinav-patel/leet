class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int c=numBottles;
        int empty=numBottles;
        while(empty>=numExchange)
        {
            numBottles=empty/numExchange;
            empty=(empty%numExchange);
            c+=numBottles;
            empty+=numBottles;
        }
        return c;
    }
}