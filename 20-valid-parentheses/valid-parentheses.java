class Solution {
    public boolean isValid(String s) 
    {
        char st[]=new char[s.length()];
        int i=-1;
        for( char ch:s.toCharArray())
        {

            if(ch=='('||ch=='{'||ch=='[')
                st[++i]=ch;
            else if(i>=0&&((ch==')'&& st[i]=='(')||(ch=='}'&& st[i]=='{')||(ch==']'&& st[i]=='[')))
            {
                i--;
            }
            else
                return false;
            
        }
        if(i==-1)
            return true;
        else
            return false;
        
    }
}