class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
           return false;

        int m1[]=new int[26];

        for(int i=0;i<s.length();i++)
        {
            m1[s.charAt(i)-'a']++;
            m1[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(m1[i]!=0)
               return false;
        }
        return true;

        
    }
}