class Solution {
    public int compareVersion(String version1, String version2) 
    {
        int i=0,j=0,m=version1.length(),n=version2.length();

        while(i<m||j<n)
        {
            int x=0,y=0;
            while(i<m && version1.charAt(i)!='.')
            {
                x=(x*10)+version1.charAt(i)-'0';
                i++;
            }
            while(j<n && version2.charAt(j)!='.')
            {
                y=(y*10)+version2.charAt(j)-'0';
                j++;
            }
            if(x>y)
               return 1;
            else if(x<y)
               return -1;
            i++;
            j++;
        }
        return 0;
        
    }
}