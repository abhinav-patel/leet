class Solution {
    public int possibleStringCount(String word) 
    {
        int c=0;
        int sum=0;
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)==word.charAt(i-1))
            {
                c++;
            }
            else
            {
                if(c>0)
                {
                    sum+=c;
                    c=0;
                }
            }      
        }
        sum+=c;
        sum++;
        return sum;
        
    }
}