class Solution {
    public int countDigitOccurrences(int[] nums, int digit) 
    {
        // int res=0;
        // char t=(char)(digit+'0');
        // for(int i:nums)
        // {
        //     String k=String.valueOf(i);
        //     for(char ch:k.toCharArray())
        //     {
        //         if(ch==t)
        //             res++;
        //     }
        // }
        // return res;

        int res=0;
        for(int i:nums)
        {
            while(i>0)
            {
                if(i%10==digit)
                    res++;
                i=i/10;
            }
        }
        return res;
    }
}