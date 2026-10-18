class Solution {
    public int totalWaviness(int num1, int num2) 
    {
        int res=0;
        for(int i=num1;i<=num2;i++)
        {
            int k=i;
            String curr=String.valueOf(k);
            // for(char ch=curr.charAt(1);ch<curr.charAt(curr.length());ch++)
            // {
            //     if(ch>curr)
            // }
            for(int j=1;j<curr.length()-1;j++)
            {

                if( (curr.charAt(j)>curr.charAt(j-1) && curr.charAt(j)>curr.charAt(j+1))||(curr.charAt(j)<curr.charAt(j-1) && curr.charAt(j)<curr.charAt(j+1) ))
                    res++;
            }
        }
        return res;
        
    }
}