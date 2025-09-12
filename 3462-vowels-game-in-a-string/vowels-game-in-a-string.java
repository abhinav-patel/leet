class Solution {
    public boolean doesAliceWin(String s) 
    {
        if(s.indexOf('a')!=-1||s.indexOf('e')!=-1||s.indexOf('o')!=-1||s.indexOf('i')!=-1||s.indexOf('u')!=-1)
        return true;
        return false;
        // String vowels="aeiou";
        // int c=0;
        // for(char ch:s.toCharArray())
        // {
        //     if(vowels.indexOf(ch)!=-1)
        //        return true;
        // }
        // if(c==0)
        //    return false;
        // return true; 
    }
}