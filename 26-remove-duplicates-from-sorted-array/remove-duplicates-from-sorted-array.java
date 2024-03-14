import java.util.*;
import java.util.stream.*;

class Solution 
{
    public int removeDuplicates(int[] arr) 
    {
        int n=arr.length;
        int curr=0;
        int i;
        for(i=1;i<n;i++)
        {
            if(arr[i]!=arr[curr])
            {
                curr++;
                arr[curr]=arr[i];
            }
        }
        // if(arr[i+1]!=arr[curr])
        //     arr[++curr]=arr[i+1];
        
        return curr+1;
           
    }
}