import java.util.*;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        Queue<Integer> small=new LinkedList<>();
        Queue<Integer> large=new LinkedList<>();
        int eq=0;
        for(int i:nums)
        {
            if(i<pivot)
               small.offer(i);
            else if(i==pivot)
               eq++;
            else
                large.offer(i);
        }
        int i=0;
        while(!small.isEmpty())
           nums[i++]=small.poll();
        while(eq>0)
        {
           nums[i++]=pivot;
           eq--;
        }
        while(!large.isEmpty())
           nums[i++]=large.poll();
        return nums;
        
    }
}