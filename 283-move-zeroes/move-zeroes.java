import java.util.*;
class Solution {
    public void moveZeroes(int[] arr)
    {
        // int n=arr.length;
        if(arr.length==1)
            return;
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {   
                arr[j]=arr[i];
                j++;
            }
        }
        // Arrays.fill(arr,j,arr.length,0);
        for(;j<arr.length;j++)
            arr[j]=0;
        //return arr;
    }
}