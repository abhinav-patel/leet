class Solution {
    public boolean check(int[] arr) 
    {
        int i=0,c=-1;
        int n=arr.length;
        for(i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {   
                c=i;
                break;

            }
        }
        if(c==-1)
            return true;
        for(i=1;i<n;i++)
        {
            if(arr[(i+c)%n]>arr[(i+c+1)%n])
                return false;
        }
        return true;
        
    }
}