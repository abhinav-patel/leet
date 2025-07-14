class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String a="";
        String b="";
        for(String s:word1)
        {
            a=a.concat(s);
        }
        for(String s:word2)
        {
            b=b.concat(s);
        }
        return a.equals(b);
        
    }
}