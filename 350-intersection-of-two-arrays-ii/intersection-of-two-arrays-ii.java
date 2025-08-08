class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int arr1[]=new int[1001];
        int arr2[]=new int[1001];

        List<Integer> res=new ArrayList<>();

        for(int n:nums1)
           arr1[n]++;
        for(int n:nums2)
           arr2[n]++;

        for(int i=0;i<1001;i++)
        {
            int times=Math.min(arr1[i],arr2[i]);
            if(times>0)
            {
                while(times-->0)
                   res.add(i);
            }
        }
        //return res.stream().mapToInt(Integer::intValue).toArray();
        int arr[]=new int[res.size()];
        int c=0;
        for(int n:res)
           arr[c++]=n;
        return arr;
        

        
    }
}