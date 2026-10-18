class Solution {
    public int numberOfBeams(String[] bank) 
    {
        int m=bank.length;
        int n=bank[0].length();
        int prev=0;
        int res=0;
        for(int i=0;i<m;i++)
        {
            String curr=bank[i];
            int now=0;
            for(char ch:curr.toCharArray())
            {
                if(ch=='1')
                {
                    now++;
                }
            }
            if(now>0)
            { 
                res+=prev*now;
                prev=now;
            }
        }
        return res;   
    }
}