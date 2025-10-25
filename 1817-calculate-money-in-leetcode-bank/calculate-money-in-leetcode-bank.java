class Solution {
    public int totalMoney(int n) 
    {
        int k=n/7;
        int sum=(k*(2*28+(k-1)*7))/2;
        int t=n%7;
        k++;
        for(int i=1;i<=t;i++)
        {
            sum+=k++;
        }
        return sum; 
    }
}