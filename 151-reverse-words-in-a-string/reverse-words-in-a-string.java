import java.util.*;
class Solution {
    public String reverseWords(String s)
    {
        StringTokenizer str=new StringTokenizer(s," ");
        String res="";
        while(str.hasMoreTokens())
        {
            String k=str.nextToken().toString();
            res=k+" "+res;
            
        }
        String r=res.trim();
        return r;
        
    }
}