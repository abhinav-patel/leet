class Solution 
{
    //few changes from the previous solution
    public int maxBottlesDrunk(int numBottles, int numExchange) 
    {
        int c=numBottles;
        int empty=numBottles;
        while(empty>=numExchange)
        {
            numBottles=1;
            empty=(empty-numExchange);
            c++;
            empty++;
            numExchange++;
        }
        return c;
        
    }
}
//from previous soln
// int c=numBottles;
//         int empty=numBottles;
//         while(empty>=numExchange)
//         {
//             numBottles=empty/numExchange;
//             empty=(empty%numExchange);
//             c+=numBottles;
//             empty+=numBottles;
//         }
//         return c;