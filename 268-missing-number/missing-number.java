class Solution {
    public int missingNumber(int[] arr)
    {
        int n=arr.length;
        //int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n;i++)
            sum2=sum2+arr[i];
        return (((n*(n+1))/2)-sum2);
    }
}