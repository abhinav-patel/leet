class Solution {
    public boolean doesAliceWin(String s) 
    {
        String vowels="aeiou";
        int c=0;
        for(char ch:s.toCharArray())
        {
            if(vowels.indexOf(ch)!=-1)
               c++;
        }
        if(c==0)
           return false;
        return true; 
    }
}