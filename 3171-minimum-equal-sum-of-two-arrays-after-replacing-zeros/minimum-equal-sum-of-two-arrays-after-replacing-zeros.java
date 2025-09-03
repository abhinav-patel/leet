class Solution {
    public long minSum(int[] nums1, int[] nums2) 
    {
        long c1=0,c2=0,s1=0,s2=0;

        for(int n:nums1)
        {
            if(n==0)
               c1++;
            else
               s1+=n;
        }
        for(int n:nums2)
        {
            if(n==0)
               c2++;
            else
               s2+=n;
        }
        if(s1<s2)
        {
            if(((s1+c1)>(s2+c2) && c2==0)||c1==0)
               return -1;
            else
               return Math.max((s1+c1),(s2+c2));
             
        }
        else if(s1>s2)
        {
            if(((s1+c1)<(s2+c2)&& c1==0)||c2==0)
               return -1;
            else
               return Math.max((s1+c1),(s2+c2));
        }
        else
        {
            if((c1==0 &&c2==0)||(c1>0 && c2>0))
               return Math.max((s1+c1),(s2+c2));
            return -1;
        }
        
    }
}