class Solution {
    public int maximum69Number (int num) 
    {
        // String str=String.valueOf(num);
        // int c=str.indexOf('6');
        // if(c<0)
        //    return num;
        // str=str.substring(0,c)+'9'+str.substring(c+1);
        // return Integer.parseInt(str);
        int rev=0;
        while(num>0)
        {
            int r=num%10;
            rev*=10;
            rev+=r;;
            num/=10;
        }
        boolean flag=true;
        while(rev>0)
        {
            int r=rev%10;
            num*=10;
            if(flag==true && r==6)
            {
                flag=false;
                num+=9;
            }
            else
            {
                num+=r;
            }
            rev=rev/10;
        }
        return num;
        
    }
}