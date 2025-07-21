class Solution {
    public String makeFancyString(String s) 
    {
        char str[]=s.toCharArray();
        char prev=str[0];
        int k=1;
        int c=1;
        for(int i=1;i<str.length;i++)
        {
            if(str[i]==prev)
            {
                c++;
            }
            else
            {
                c=1;
                prev=str[i];
            }
            if(c<3)
            {
                str[k++]=str[i];

            }
        }
        return new String(str,0,k);
        /*StringBuilder sb=new StringBuilder("");
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
        */
        
    }
}