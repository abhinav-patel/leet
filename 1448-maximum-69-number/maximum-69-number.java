class Solution {
    public int maximum69Number (int num) 
    {
        String str=String.valueOf(num);
        int c=str.indexOf('6');
        if(c<0)
           return num;
        str=str.substring(0,c)+'9'+str.substring(c+1);
        return Integer.parseInt(str);
        
    }
}