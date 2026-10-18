class Solution {
    public int totalWaviness(int num1, int num2) 
    {
        int res=0;
        for(int i=num1;i<=num2;i++)
        {
            int t=i;
            String curr=String.valueOf(t);
            // for(char ch=curr.charAt(1);ch<curr.charAt(curr.length());ch++)
            // {
            //     if(ch>curr)
            // }
            for(int j=1;j<curr.length()-1;j++)
            {
                char k=curr.charAt(j);
                char l=curr.charAt(j-1);
                char m=curr.charAt(j+1);
                if( (k>l && k>m)||(k<l && k<m ))
                    res++;
            }
        }
        return res;
        
    }
}