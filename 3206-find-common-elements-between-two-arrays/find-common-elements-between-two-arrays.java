class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) 
    {
        int n1[]=new int[101];
        int n2[]=new int[101];

        for(int num:nums1)
           n1[num]=1;
        for(int num:nums2)
           n2[num]=1;

        int left=0,right=0;

        for(int num:nums1)
           left+=n2[num];
        for(int num:nums2)
           right+=n1[num];

        return new int[]{left,right};
        /*int n=nums1.length;
        int m=nums2.length;
        int left=0,right=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                   left++;
                   break;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums2[i]==nums1[j])
                {
                   right++;
                   break;
                }
            }
        }
        return new int[]{left,right};
        */

        
    }
}