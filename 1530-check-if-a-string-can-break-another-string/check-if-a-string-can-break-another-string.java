class Solution {
    public boolean checkIfCanBreak(String s1, String s2) 
    {
        char str1[]=s1.toCharArray();
        Arrays.sort(str1);
        char str2[]=s2.toCharArray();
        Arrays.sort(str2);
        boolean flag=true;
        for(int i=0;i<str1.length;i++)
        {
            if(str1[i]<str2[i])
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
           return flag;
        for(int i=0;i<str1.length;i++)
        {
            if(str2[i]<str1[i])
            {
                return false;
            }
        }
        return true;   
    }
}