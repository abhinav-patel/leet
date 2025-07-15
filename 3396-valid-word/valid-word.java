class Solution {
    public boolean isValid(String word) 
    {
        if(word.length()<3)
           return false;
        String Vowels="aeiouAEIOU";
        int v=0,c=0;
        for(char ch:word.toCharArray())
        {
            if(Character.isDigit(ch))
               continue;
            else if(Character.isLetter(ch))
            {
                if(Vowels.indexOf(ch)!=-1)
                   v++;
                else
                   c++;
            }
            else
               return false;
        }
        if(c>0&&v>0)
           return true;
        return false;

        
    }
}