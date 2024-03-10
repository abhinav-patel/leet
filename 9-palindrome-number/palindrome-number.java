class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x==0)
            return true;
        if(x<0)
            return false;

        int temp=x;
        int sum=0;
        while(temp>0)
        {
            sum=(sum*10)+temp%10;
            temp=temp/10;
        }
        //System.out.println(sum)
        if(sum==x)
            return true;
        return false;
        
    }
}