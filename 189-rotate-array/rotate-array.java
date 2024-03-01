class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        if(k>=n)
           k=k%n;
        if(n>1)
        {
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        }
    }
    public void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}