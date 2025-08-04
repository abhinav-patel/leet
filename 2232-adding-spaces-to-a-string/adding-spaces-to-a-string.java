class Solution 
{
    public String addSpaces(String s, int[] spaces) 
    {
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i:spaces)
        {
            sb.append(s.substring(c,i)).append(" ");
            c=i;
        }
        sb.append(s.substring(c));
        return sb.toString();   
    }
}

// StringBuilder str=new StringBuilder(s);
//         for(int i=0;i<spaces.length;i++)
//         {
//             String temp="";
//             temp=str.substring(0,i+spaces[i]);
//             temp=temp+" "+str.substring(i+spaces[i],str.length());
//             str.replace(0,str.length(),temp);
//         }
//         return str.toString();