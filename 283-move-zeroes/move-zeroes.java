import java.util.*;
class Solution {
    public void moveZeroes(int[] arr)
    {
        int n=arr.length;

        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {   
                arr[j]=arr[i];
                j++;
            }
        }
        // Arrays.fill(arr,j,n,0);
        for(;j<n;j++)
            arr[j]=0;
        //return arr;
    }
}