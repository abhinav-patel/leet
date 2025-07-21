class Solution {
    public String makeFancyString(String s) 
    {
        StringBuilder sb=new StringBuilder("");
        int c=1;
        char prev=s.charAt(0);
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(curr==prev)
            {
                c++;
            }
            else
               c=1;
            if(c>=3)
               continue;
            prev=curr;
            sb.append(curr);
        }
        return sb.toString();
        
    }
}