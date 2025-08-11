class Solution {
    public boolean checkValidString(String s) 
    {
        int left=0;
        int right=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                left++;
                right++;
            }
            else if(ch==')')
            {
                if(left>0)
                   left--;
                right--;
            }
            else
            {
                if(left>0)
                   left--;
                right++;
            }
            if(right<0)
               return false;
        }
        return left==0;
    }
}