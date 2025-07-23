class Solution {
    public boolean threeConsecutiveOdds(int[] arr) 
    {
        if(arr.length<3)
           return false;
        int a=arr[0];
        int b=arr[1];
        int c=arr[2];
        if(a%2==1 && b%2==1 && c%2==1)
           return true;
        int i=3;
        while(i<arr.length)
        {
            a=b;
            b=c;
            c=arr[i++];
            if(a%2==1 && b%2==1 && c%2==1)
           return true;

        }
        return false;
    }
}