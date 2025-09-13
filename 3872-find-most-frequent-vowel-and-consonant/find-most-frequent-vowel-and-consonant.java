class Solution {
    public int maxFreqSum(String s) 
    {
        String vowels="aeiou";
        int freq[]=new int[26];
        int v=0;
        int c=0;

        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                if(freq[ch-'a']>v)
                   v=freq[ch-'a'];
            }
            else
            {
                if(freq[ch-'a']>c)
                   c=freq[ch-'a'];
            } 
        }
        return v+c;
    }
}