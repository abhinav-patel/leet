import java.util.*;
import java.util.stream.*;

class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        SortedSet<Integer> t=new TreeSet<>();
        for(int i:nums)
            t.add(i);
        
        int k=0;
        for(Integer i:t)
           nums[k++]=(int)i;
        return t.size();
           
    }
}