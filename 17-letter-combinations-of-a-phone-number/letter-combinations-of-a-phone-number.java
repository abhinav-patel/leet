class Solution 
{
    List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String digits) 
    {
        if(digits.length()==0)
           return res;
        recursive(digits,0,"");
        return res;   
    }
    public void recursive(String digits,int i,String temp)
    {
        if(i>=digits.length())
        {
            res.add(temp);
            return;
        }
        switch(digits.charAt(i))
        {
            case '2':
                recursive(digits,i+1,temp+'a');
                recursive(digits,i+1,temp+'b');
                recursive(digits,i+1,temp+'c');
                break;
            case '3':
                recursive(digits,i+1,temp+'d');
                recursive(digits,i+1,temp+'e');
                recursive(digits,i+1,temp+'f');
                break;
            case '4':
                recursive(digits,i+1,temp+'g');
                recursive(digits,i+1,temp+'h');
                recursive(digits,i+1,temp+'i');
                break;
            case '5':
                recursive(digits,i+1,temp+'j');
                recursive(digits,i+1,temp+'k');
                recursive(digits,i+1,temp+'l');
                break;
            case '6':
                recursive(digits,i+1,temp+'m');
                recursive(digits,i+1,temp+'n');
                recursive(digits,i+1,temp+'o');
                break;
            case '7':
                recursive(digits,i+1,temp+'p');
                recursive(digits,i+1,temp+'q');
                recursive(digits,i+1,temp+'r');
                recursive(digits,i+1,temp+'s');
                break;
            case '8':
                recursive(digits,i+1,temp+'t');
                recursive(digits,i+1,temp+'u');
                recursive(digits,i+1,temp+'v');
                break;
            case '9':
                recursive(digits,i+1,temp+'w');
                recursive(digits,i+1,temp+'x');
                recursive(digits,i+1,temp+'y');
                recursive(digits,i+1,temp+'z');
                break;
        }
    }
}