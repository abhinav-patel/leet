import java.util.*;

class Solution 
{
    static {
        for (int i = 0; i < 300; i++) {
            pivotArray(new int[2],0);
        }
    }
    public static int[] pivotArray(int[] nums, int pivot) 
    {
        int n=nums.length;
        int res[]=new int[n];
        int left=0,right=n-1;
        int j=n-1;
        for(int i:nums)
        {
            if(i<pivot)
               res[left++]=i;
            if(nums[j]>pivot)
               res[right--]=nums[j];
            j--;
        }
        while(left<=right)
           res[left++]=pivot;
        return res;



        // Queue<Integer> small=new LinkedList<>();
        // Queue<Integer> large=new LinkedList<>();
        // int eq=0;
        // for(int i:nums)
        // {
        //     if(i<pivot)
        //        small.offer(i);
        //     else if(i==pivot)
        //        eq++;
        //     else
        //         large.offer(i);
        // }
        // int i=0;
        // while(!small.isEmpty())
        //    nums[i++]=small.poll();
        // while(eq>0)
        // {
        //    nums[i++]=pivot;
        //    eq--;
        // }
        // while(!large.isEmpty())
        //    nums[i++]=large.poll();
        // return nums;
        
    }
}